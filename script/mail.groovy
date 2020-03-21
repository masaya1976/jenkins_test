/**
 * メール通知
 *
 */
// メールをGmailに送信する
def send(result) {
    mail to: "masaya1976@gmail.com",
        subject: "${env.JOB_NAME} #${env.BUILD_NUMBER} [${result}]",
        body: "Build URL: ${env.BUILD_URL}.\n\n"
}
return this
