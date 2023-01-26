package azimvand.reza.interfaceobjectexpression

interface DownloadListener {
        fun onStart()
        fun onDownloading(percent: Int)
        fun onComplete(fileName: String)
    }