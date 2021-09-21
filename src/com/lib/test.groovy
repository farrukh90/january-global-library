def say_hello(REPO) {
    node {
        stage("Stage1"){
            git "${REPO}"
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
