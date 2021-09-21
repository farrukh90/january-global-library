def say_hello() {
    node {
        stage("Stage1"){
            sh "echo Hello world"
        }
        stage("Stage2"){
            sh "echo sending email"
        }
    }
}
