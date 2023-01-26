package azimvand.reza.interfaceobjectexpression

fun main() {
    val downloader = Downloader("https://www.github.com/images/image1.jpg",
        object : DownloadListener {
            override fun onStart() {
                println("download is start")
            }

            override fun onDownloading(percent: Int) {
                println("downloaded $percent%")
            }

            override fun onComplete(fileName: String) {
                println("downloaded $fileName")
            }

        })
    downloader.start()
}