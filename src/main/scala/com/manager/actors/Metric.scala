package com.manager.actors

import java.time.Instant
import akka.event.Logging.LogLevel

case class Metric(stamp:Instant,id:String,message:String,level:LogLevel,tech:String)
