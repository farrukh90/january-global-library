def say_hello() {
    node {
        stage("Stage1"){
            sh "echo Hello world"
        }
    }
}



// # Declarative
// pipeline {
//     agent any
//     stages {
//         stage("stage1"){
//             steps{
//                 sh "echo Hello world"
//             }
//         }
//     }
// }