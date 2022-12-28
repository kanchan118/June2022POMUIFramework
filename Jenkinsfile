pipeline{
    
    agent any
    
    stages{
        
        stage("Build"){
            steps{
                echo ("build project")
            }
        }
        
        stage("Deploy to Dev"){
            steps{
            echo ("deploy to dev env")
            }
        }
        
        stage("Run UT's"){
            steps{
            echo ("Run UTs")
            }
        }
        
        stage("Deploy to QA"){
            steps{
            echo ("deploy to dev QA")
            }
        }
        
        stage("Run Regression Automation Test"){
            steps{
            echo ("run regression test cases")
            }
        }
        
        stage("Deploy to STAGE"){
            steps{
            echo ("deploy to stage env")
            }
        }
        
        stage("Run Sanity Automation Test"){
            steps{
            echo ("run sanity test cases")
            }
        }
        
        stage("Deploy to PROD"){
            steps{
            echo ("deploy to PROD env")
            }
        }
    }
    
    
}