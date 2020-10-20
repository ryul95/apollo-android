// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.fragments_with_type_condition_nullable.fragment

import com.apollographql.apollo.api.ResponseField
import com.apollographql.apollo.api.internal.ResponseAdapter
import com.apollographql.apollo.api.internal.ResponseReader
import com.apollographql.apollo.api.internal.ResponseWriter
import kotlin.Array
import kotlin.Double
import kotlin.String
import kotlin.Suppress

@Suppress("NAME_SHADOWING", "UNUSED_ANONYMOUS_PARAMETER", "LocalVariableName",
    "RemoveExplicitTypeArguments", "NestedLambdaShadowedImplicitParameter", "PropertyName",
    "RemoveRedundantQualifierName")
internal object HumanDetails_ResponseAdapter : ResponseAdapter<HumanDetails.DefaultImpl> {
  private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
    ResponseField.forString("__typename", "__typename", null, false, null),
    ResponseField.forString("name", "name", null, false, null),
    ResponseField.forDouble("height", "height", null, true, null)
  )

  override fun fromResponse(reader: ResponseReader, __typename: String?): HumanDetails.DefaultImpl {
    return reader.run {
      var __typename: String? = __typename
      var name: String? = null
      var height: Double? = null
      while(true) {
        when (selectField(RESPONSE_FIELDS)) {
          0 -> __typename = readString(RESPONSE_FIELDS[0])
          1 -> name = readString(RESPONSE_FIELDS[1])
          2 -> height = readDouble(RESPONSE_FIELDS[2])
          else -> break
        }
      }
      HumanDetails.DefaultImpl(
        __typename = __typename!!,
        name = name!!,
        height = height
      )
    }
  }

  override fun toResponse(writer: ResponseWriter, value: HumanDetails.DefaultImpl) {
    writer.writeString(RESPONSE_FIELDS[0], value.__typename)
    writer.writeString(RESPONSE_FIELDS[1], value.name)
    writer.writeDouble(RESPONSE_FIELDS[2], value.height)
  }
}
