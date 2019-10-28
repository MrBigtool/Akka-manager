import akka.actor.{ActorSystem, Props}
import com.manager.actors.LogReaderActor

object Driver extends App{
  val System = ActorSystem("Actor-Manager")
  val LogReaderActor = System.actorOf(Props[LogReaderActor], name = "logreader")
  LogReaderActor ! "ping"
  LogReaderActor ! "mylog..."

}