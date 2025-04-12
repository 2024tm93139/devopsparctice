def build_success=false
def cdir
pipeline{
  agent {
    label 'slaveagent'
  }
  tools{
    maven 'maven'
  }
  stages{
    stage("build"){
      steps{
        echo("Inside build to test polling")
        script{
          try{
            bat "mvn clean"
            bat "mvn compile"
          }
          catch(err){
           echo "Build fail with $err. Continuing to next step" 
          }
        }
      }
    }
    stage("test"){
      steps{
        echo("Inside test")
        script{
          try{
            bat "mvn test"
          }
          catch(err){
           echo "Test fail with $err. Continuing to next step" 
          }
        }
      }
    }
    stage("deploy"){
      steps{
        echo("Inside deploy")
        script{
          try{
            bat "mvn install"
            
          }
          catch(err){
           echo "deploy fail with $err. Continuing to next step" 
          }
        }
      }
    }
  }
}
