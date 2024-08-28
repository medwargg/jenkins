pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                git branch: 'master', url: 'https://github.com/medwargg/jenkins.git'
                sh 'ls -la'
            }
        }
    }
}