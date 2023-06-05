import server.Server.startServer

/**
 *  rsAgent
 *  - gitHub:       https://github.com/sopka13/rsAgent
 *  - publicBoard:  https://miro.com/app/board/uXjVMBkQXXo=/#tpicker-content
 *
 * Backlog:
 *  1. Read configFile
 */
object Main {
  def main(args: Array[String]): Unit = {
    println("rsAgent start")
    startServer()
  }
}
