package example.filedownload.pub;

public interface DownloadListener {
    public void updateProcess(DownloadMgr mgr);			// 更新进度
    public void finishDownload(DownloadMgr mgr);			// 完成下载
    public void preDownload();					// 准备下载
    public void errorDownload(int error);				// 下载错误
}
