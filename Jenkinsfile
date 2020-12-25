pipeline {
    agent none
    stages {
      stage('Compile') {
        agent { label 'master' }
        steps {
          def jenkinsUid = sh(returnStdout: true, script: 'id -u').trim()
          echo jenkinsUid
          // with group docker so that we can run docker inside docker
          // 'getent group docker' result => groupName:x:GID:...
          def dockerGid = sh(returnStdout: true, script: 'getent group docker').trim().split(":")[2]
          withDockerContainer(
                  image: "maven:3-jdk-11",
                  args: "-u $jenkinsUid:$dockerGid",
                  toolName: env.DOCKER_TOOL_NAME) {
            script {
              echo("Running mvn install")
              sh "mvn clean install -T 2C --no-transfer-progress -DskipTests -Ddisable-initializr-default-profile -Dmaven.repo.local=m2"
            } // script
          } // withDockerContainer
        } // steps
      } // stage Compile
      stage('Deploy') {
        when {
          expression { "${BRANCH_NAME}" == 'add-loco-repo' }
        }
        agent { label 'master' }
        steps {
          def jenkinsUid = sh(returnStdout: true, script: 'id -u').trim()
          echo jenkinsUid
          // with group docker so that we can run docker inside docker
          // 'getent group docker' result => groupName:x:GID:...
          def dockerGid = sh(returnStdout: true, script: 'getent group docker').trim().split(":")[2]

          withDockerContainer(
                  image: "google/cloud-sdk",
                  args: '-u $jenkinsUid:$dockerGid -v /var/run/docker.sock:/var/run/docker.sock',
                  toolName: env.DOCKER_TOOL_NAME) {
            script {
              dir ('initializr-locorepo') {
                withCredentials([file(credentialsId: 'gcr-jenkins-service-account', variable: 'GC_KEY')]) {
                  sh("gcloud auth activate-service-account --key-file=${GC_KEY}")
                  sh("gcloud auth configure-docker")
                  sh "../mvnw jib:dockerBuild --no-transfer-progress -Dmaven.repo.local=../m2"
                  sh "docker push gcr.io/loco-repo-298115/initializr-locorepo"
                }
              }
            }
          }
        }
      }
    }
}
