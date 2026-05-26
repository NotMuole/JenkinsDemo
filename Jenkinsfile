pipeline {
  agent any
  environment { APP_NAME = 'JenkinsDemo' }

  stages {
    stage('Build')  { steps { sh 'mvn -B -DskipTests clean package' } }
    stage('Test')   { steps { sh 'mvn -B test' } }
    stage('Deploy') { steps { echo "Deploying ${APP_NAME} build #${env.BUILD_NUMBER}" } }
  }


  post {
    always  { junit 'target/surefire-reports/*.xml' }
    success {
      echo 'Pipeline success'
      archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
    }
    failure { echo 'Pipeline failed' }
  }
}