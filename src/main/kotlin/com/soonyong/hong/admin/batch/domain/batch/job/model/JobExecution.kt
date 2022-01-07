package com.soonyong.hong.admin.batch.domain.batch.job.model

import java.time.ZonedDateTime
import javax.persistence.*

@Entity
@Table(name = "BATCH_JOB_EXECUTION")
class JobExecution(
    jobExecutionId: Long,
    version: Long,
    jobInstance: JobInstance,
    createDateTime: ZonedDateTime,
    startDateTime: ZonedDateTime,
    endDateTime: ZonedDateTime,
    status: String,
    exitCode: String,
    exitMessage: String,
    lastUpdateDateTime: ZonedDateTime,
    jobConfigurationLocation: String
) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "JOB_EXECUTION_ID")
    val jobExecutionId: Long? = jobExecutionId

    @Column(name = "VERSION")
    val version: Long = version

    @ManyToOne
    @JoinColumn(name = "JOB_INSTANCE_ID")
    val jobInstance: JobInstance = jobInstance


    @Column(name = "CREATE_TIME")
    val createDateTime: ZonedDateTime = createDateTime

    @Column(name = "START_TIME")
    val startDateTime: ZonedDateTime = startDateTime

    @Column(name = "END_TIME")
    val endDateTime: ZonedDateTime = endDateTime

    @Column(name = "STATUS")
    val status: String = status

    @Column(name = "EXIT_CODE")
    val exitCode: String = exitCode

    @Column(name = "EXIT_MESSAGE")
    val exitMessage: String = exitMessage

    @Column(name = "LAST_UPDATED")
    val lastUpdateDateTime: ZonedDateTime = lastUpdateDateTime

    @Column(name = "JOB_CONFIGURATION_LOCATION")
    val jobConfigurationLocation: String = jobConfigurationLocation
}