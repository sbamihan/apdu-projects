pipeline {
  agent any
  stages {
    stage('Server') {
      agent {
        docker {
          image 'maven:3.6.3'
        }

      }
      steps {
        sh '''echo "Building the server code..."
mvn -version
mvn clean install'''
        stash(name: 'server', includes: '**/*.war')
      }
    }

  }
}