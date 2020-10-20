// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.fragment_in_fragment.fragment

import com.apollographql.apollo.api.ResponseField
import com.apollographql.apollo.api.internal.ResponseAdapter
import com.apollographql.apollo.api.internal.ResponseReader
import com.apollographql.apollo.api.internal.ResponseWriter
import kotlin.Array
import kotlin.String
import kotlin.Suppress

@Suppress("NAME_SHADOWING", "UNUSED_ANONYMOUS_PARAMETER", "LocalVariableName",
    "RemoveExplicitTypeArguments", "NestedLambdaShadowedImplicitParameter", "PropertyName",
    "RemoveRedundantQualifierName")
internal object PilotFragment_ResponseAdapter : ResponseAdapter<PilotFragment.DefaultImpl> {
  private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
    ResponseField.forString("__typename", "__typename", null, false, null),
    ResponseField.forString("name", "name", null, true, null),
    ResponseField.forObject("homeworld", "homeworld", null, true, null)
  )

  override fun fromResponse(reader: ResponseReader, __typename: String?):
      PilotFragment.DefaultImpl {
    return reader.run {
      var __typename: String? = __typename
      var name: String? = null
      var homeworld: PilotFragment.Homeworld1? = null
      while(true) {
        when (selectField(RESPONSE_FIELDS)) {
          0 -> __typename = readString(RESPONSE_FIELDS[0])
          1 -> name = readString(RESPONSE_FIELDS[1])
          2 -> homeworld = readObject<PilotFragment.Homeworld1>(RESPONSE_FIELDS[2]) { reader ->
            Homeworld1_ResponseAdapter.fromResponse(reader)
          }
          else -> break
        }
      }
      PilotFragment.DefaultImpl(
        __typename = __typename!!,
        name = name,
        homeworld = homeworld
      )
    }
  }

  override fun toResponse(writer: ResponseWriter, value: PilotFragment.DefaultImpl) {
    writer.writeString(RESPONSE_FIELDS[0], value.__typename)
    writer.writeString(RESPONSE_FIELDS[1], value.name)
    if(value.homeworld == null) {
      writer.writeObject(RESPONSE_FIELDS[2], null)
    } else {
      writer.writeObject(RESPONSE_FIELDS[2]) {
        Homeworld1_ResponseAdapter.toResponse(writer, value.homeworld)
      }
    }
  }

  object Homeworld1_ResponseAdapter : ResponseAdapter<PilotFragment.Homeworld1> {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField.forString("__typename", "__typename", null, false, null),
      ResponseField.forString("name", "name", null, true, null)
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?):
        PilotFragment.Homeworld1 {
      return reader.run {
        var __typename: String? = __typename
        var name: String? = null
        while(true) {
          when (selectField(RESPONSE_FIELDS)) {
            0 -> __typename = readString(RESPONSE_FIELDS[0])
            1 -> name = readString(RESPONSE_FIELDS[1])
            else -> break
          }
        }
        PilotFragment.Homeworld1(
          __typename = __typename!!,
          name = name
        )
      }
    }

    override fun toResponse(writer: ResponseWriter, value: PilotFragment.Homeworld1) {
      writer.writeString(RESPONSE_FIELDS[0], value.__typename)
      writer.writeString(RESPONSE_FIELDS[1], value.name)
    }
  }
}
