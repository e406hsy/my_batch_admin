package com.soonyong.hong.admin.batch.domain.batch.job.repository

import com.soonyong.hong.admin.batch.domain.batch.job.model.JobInstance
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface JobInstanceRepository : JpaRepository<JobInstance, Long> {}