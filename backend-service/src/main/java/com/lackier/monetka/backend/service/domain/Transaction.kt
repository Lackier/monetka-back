package com.lackier.monetka.backend.service.domain

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "transaction")
class Transaction(
    @Column(nullable = false)
    var name: String? = null,

    @Column(nullable = false)
    var value: Double? = null,

    @Column
    var description: String? = null,

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id", nullable = false)
    val category: Category? = null
) : AbstractEntity<UUID>()