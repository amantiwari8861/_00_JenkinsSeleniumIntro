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

        junit allowEmptyResults: true,
              testResults: 'target/surefire-reports/*.xml'

        archiveArtifacts artifacts: 'target/**', fingerprint: true

        publishHTML([
            allowMissing: true,
            alwaysLinkToLastBuild: true,
            keepAll: true,
            reportDir: 'reports',
            reportFiles: 'report.html',
            reportName: 'Extent Report'
        ])
    }

    success {
        echo 'All Selenium tests passed.'
    }

    failure {
        echo 'Some Selenium tests failed.'
    }
}
}