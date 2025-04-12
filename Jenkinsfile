def build_success=false
def cdir = %cd%
pipeline{
  agent any
  stages{
    stage("build"){
      steps{
        //cdir=this.pwd()
        echo("Inside build {$dir}")
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
