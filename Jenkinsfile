pipeline {
    agent none
    stages {
      stage('Compile') {
        agent { label 'master' }
        steps {
          withDockerContainer(
                  image: "maven:3-jdk-11",
                  args: '',
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
          withDockerContainer(
                  image: "google/cloud-sdk",
                  args: '-u root -v /var/run/docker.sock:/var/run/docker.sock',
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
