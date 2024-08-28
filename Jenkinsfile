pipeline {
    agent any

    stages {
        stage('List files') {
            steps {
                sh 'ls -la'
            }
        }
        stage('Print maven version') {
            steps {
                sh './mvnw --version'
            }
        }
    }
}