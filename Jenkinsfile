pipeline {
    agent none
    stages {
      stage('Compile') {
        agent { label 'master' }
        steps {
            script {
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
            }
        } // steps
      } // stage Compile
    }
}
