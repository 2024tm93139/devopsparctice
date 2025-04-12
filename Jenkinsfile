def build_success=false
def cdir
pipeline{
  agent any
  stages{
    stage("build"){
      steps{
        echo("Inside build")
        script{
          try{
            bat "javac HelloWorld.java"
          }
          catch(err){
           echo "Build fail with $err" 
          }
        }
      }
    }
    stage("test"){
      steps{
        echo("Inside test")
      }
    }
    stage("deploy"){
      steps{
        echo("Inside deploy")
      }
    }
  }
}
