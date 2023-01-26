package azimvand.reza.interfaceobjectexpression

class Downloader(
    private val url: String,
    private val downloadListener: DownloadListener
) {

    fun start() {
        downloadListener.onStart()
        for (i in 1..10) {
            Thread.sleep(1000)
            downloadListener.onDownloading(i * 10)
        }
        downloadListener.onComplete(url)
    }


}