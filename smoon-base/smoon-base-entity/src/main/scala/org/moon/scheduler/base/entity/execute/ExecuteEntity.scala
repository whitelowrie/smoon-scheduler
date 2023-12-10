package org.smoon.scheduler.base.entity.execute

object ExecuteEntity {

  case class Job[V](id: Long, name: String, graph: IGraph[V], status: Int) extends IEntity

}
