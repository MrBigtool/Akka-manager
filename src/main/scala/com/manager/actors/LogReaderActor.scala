package com.manager.actors

import java.util.regex.Pattern

import akka.actor.{Actor, ActorLogging}

import scala.util.matching.Regex

// this log try to get a metric with pattern:
//
class LogReaderActor extends Actor with ActorLogging{
  val RegexPattern: Nothing = """^(\d) (\S.+) (\d)$""".r: Regex

  System.out.println("Constructor")

  override def
  preStart() {println("preStart")}

  override def
  postStop() {println("postStop")}

  override def
  preRestart(reason: Throwable, message: Option[Any]) {
    println("preRestart")
    super.preRestart (reason, message)
  }

  override def postRestart(reason: Throwable) {
    println("postRestart")
    super.postRestart(reason)
  }

  def receive = {
    case "restart" => throw new IllegalStateException("force restart")
    case msg -> "ping" => println("pong!")
  }
}
