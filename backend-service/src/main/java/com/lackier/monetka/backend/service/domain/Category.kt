package com.lackier.monetka.backend.service.domain

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "category")
class Category(
    @Column(nullable = false)
    var name: String? = null,

    @Column(nullable = false)
    val type: CategoryType? = null,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    val parent: Category? = null
) : AbstractEntity<UUID>()