pipeline {
    agent any

    stages {
        stage('Compile') {
            steps {
                sh './mvnw clean compile'
            }
        }

        stage('Test'){
            steps{
                sh './mvnw test'
            }
        }

        stage('Build'){
            steps{
                sh './mvnw package -B -ntp'
            }
        }
    }
}