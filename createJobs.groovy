pipelineJob('sentimentPipeline') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/MQuillian/social-sentiment-analysis.git'
                    }
                    branch 'development'
                }
            }
        }
    }
}