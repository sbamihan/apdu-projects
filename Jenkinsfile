pipeline {
  agent any
  stages {
    stage('error') {
      agent {
        docker {
          image 'maven:3.6.3'
        }

      }
      steps {
        sh 'echo "Building the server code..."'
      }
    }

  }
}