pipeline {
    agent any

    tools {
        maven 'Maven3'
        jdk 'JDK21'
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/amantiwari8861/_00_JenkinsSeleniumIntro'
            }
        }

        stage('Build & Test') {
            steps {
                sh 'mvn clean test'
            }
        }
    }
     post {
        always {

            junit allowEmptyResults: true,
                  testResults: 'target/surefire-reports/*.xml'

            allure([
                includeProperties: false,
                results: [[path: 'allure-results']]
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