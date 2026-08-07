pipeline {
    agent any

    tools {
        jdk 'java25'
        maven 'mvn3_9'
    }

    stages {

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Run Selenium Tests') {
            steps {
                bat 'mvn test'
            }
        }
    }

    post {
        always {
            junit 'target/surefire-reports/*.xml'
            archiveArtifacts artifacts: 'target/**', fingerprint: true
        }

        success {
            echo 'All Selenium tests passed.'
        }

        failure {
            echo 'Some Selenium tests failed.'
        }
    }
}