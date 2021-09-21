def say_hello() {
    node {
        stage("Stage1"){
            git 'https://github.com/farrukh90/jenkins-class-packer.git'
    }
        stage("Stage2"){
            echo "hello"
    }
        stage("Stage3"){
            echo "hello"
    }
        stage("Stage4"){
            echo "hello"
    }
        stage("Stage5"){
            echo "hello"
        }
    }
}
