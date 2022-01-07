package com.soonyong.hong.admin.batch.domain.batch.job.model

import javax.persistence.*

@Entity
@Table(name = "BATCH_JOB_INSTANCE")
class JobInstance(jobInstanceId: Long, jobName: String, jobKey: String, version: Long) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "JOB_INSTANCE_ID")
    val jobInstanceId: Long? = jobInstanceId

    @Column(name = "JOB_KEY")
    val jobKey: String = jobKey

    @Column(name = "JOB_NAME")
    val jobName: String = jobName

    @Column(name = "VERSION")
    val version: Long = version
}