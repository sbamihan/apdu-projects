pipeline {
  agent any
  stages {
    stage('Build') {
      agent {
        docker {
          image 'maven:3.6.3'
        }

      }
      steps {
        sh '''echo "Building the server code..."
mvn -version'''
      }
    }

  }
}