def build_success=false
def cdir
pipeline{
  agent any
  stages{
    stage("build"){
      steps{
        //script{
         //cdir=this.pwd() 
       // }
        sh "javac HelloWorld.java"
        echo("Inside build")
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
