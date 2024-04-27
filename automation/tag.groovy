def AutoTag() {
    stage('AutoTag'){
        sh 'echo TAG IS STARTED '
        sh 'echo ${MY_BRANCH}'
        env.STREAM_VERSION = sh ( script: 'git describe --abbrev=0 --tags', returnStdout: true).trim()      //Store Full tag
       // env.STREAM = sh ( script: 'echo $STREAM_VERSION | cut -d "-" -f1', returnStdout: true).trim()       //Store Stream Name
        //env.CURRENT_MAX = sh ( script: 'echo $STREAM_VERSION | cut -d "-" -f2 ', returnStdout: true).trim() //Store Main Max 
        sh'echo we are at ${MY_BRANCH} stage'   //Print Stage
        sh 'echo ${STREAM_VERSION}'     //Print Latest Tag to the stage
       // sh 'echo ${STREAM}'     //Print Stream Name
        //sh 'echo ${CURRENT_MAX}'    //Print Main Max
        //sh 'echo this is old ${MY_BRANCH} version ${LINE_VERSION}'      //Print old version
        // Switch cases based on branch name 
       
    }
}
return this;