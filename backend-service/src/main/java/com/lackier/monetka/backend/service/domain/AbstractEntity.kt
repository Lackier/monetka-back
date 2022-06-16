package com.lackier.monetka.backend.service.domain

import org.springframework.data.util.ProxyUtils
import java.time.ZonedDateTime
import javax.persistence.*

@MappedSuperclass
abstract class AbstractEntity<T : java.io.Serializable> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private var id: T? = null

    @Column(name = "created_by")
    private var createdBy: String? = null

    @Column(name = "create_date")
    private var createdAt: ZonedDateTime? = null

    @Column(name = "updated_by")
    private var updatedBy: String? = null

    @Column(name = "update_date")
    private var updatedAt: ZonedDateTime? = null

    open fun getId(): T? {
        return id
    }

    override fun equals(other: Any?): Boolean {
        other ?: return false

        if (this === other) return true

        if (javaClass != ProxyUtils.getUserClass(other)) return false

        other as AbstractEntity<*>

        if (null == this.getId()) {
            return false
        } else {
            return this.getId() == other.getId()
        }
    }

    override fun hashCode(): Int {
        return 31
    }

    override fun toString() = "Entity of type ${this.javaClass.name} with id: $id"
}