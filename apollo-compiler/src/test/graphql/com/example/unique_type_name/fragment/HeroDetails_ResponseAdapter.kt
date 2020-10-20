// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.unique_type_name.fragment

import com.apollographql.apollo.api.ResponseField
import com.apollographql.apollo.api.internal.ResponseAdapter
import com.apollographql.apollo.api.internal.ResponseReader
import com.apollographql.apollo.api.internal.ResponseWriter
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List

@Suppress("NAME_SHADOWING", "UNUSED_ANONYMOUS_PARAMETER", "LocalVariableName",
    "RemoveExplicitTypeArguments", "NestedLambdaShadowedImplicitParameter", "PropertyName",
    "RemoveRedundantQualifierName")
internal object HeroDetails_ResponseAdapter : ResponseAdapter<HeroDetails.DefaultImpl> {
  private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
    ResponseField.forString("__typename", "__typename", null, false, null),
    ResponseField.forString("name", "name", null, false, null),
    ResponseField.forObject("friendsConnection", "friendsConnection", null, false, null)
  )

  override fun fromResponse(reader: ResponseReader, __typename: String?): HeroDetails.DefaultImpl {
    return reader.run {
      var __typename: String? = __typename
      var name: String? = null
      var friendsConnection: HeroDetails.FriendsConnection1? = null
      while(true) {
        when (selectField(RESPONSE_FIELDS)) {
          0 -> __typename = readString(RESPONSE_FIELDS[0])
          1 -> name = readString(RESPONSE_FIELDS[1])
          2 -> friendsConnection = readObject<HeroDetails.FriendsConnection1>(RESPONSE_FIELDS[2]) { reader ->
            FriendsConnection1_ResponseAdapter.fromResponse(reader)
          }
          else -> break
        }
      }
      HeroDetails.DefaultImpl(
        __typename = __typename!!,
        name = name!!,
        friendsConnection = friendsConnection!!
      )
    }
  }

  override fun toResponse(writer: ResponseWriter, value: HeroDetails.DefaultImpl) {
    writer.writeString(RESPONSE_FIELDS[0], value.__typename)
    writer.writeString(RESPONSE_FIELDS[1], value.name)
    writer.writeObject(RESPONSE_FIELDS[2]) {
      FriendsConnection1_ResponseAdapter.toResponse(writer, value.friendsConnection)
    }
  }

  object Node1_ResponseAdapter : ResponseAdapter<HeroDetails.Node1> {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField.forString("__typename", "__typename", null, false, null),
      ResponseField.forString("name", "name", null, false, null)
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?): HeroDetails.Node1 {
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
        HeroDetails.Node1(
          __typename = __typename!!,
          name = name!!
        )
      }
    }

    override fun toResponse(writer: ResponseWriter, value: HeroDetails.Node1) {
      writer.writeString(RESPONSE_FIELDS[0], value.__typename)
      writer.writeString(RESPONSE_FIELDS[1], value.name)
    }
  }

  object Edge1_ResponseAdapter : ResponseAdapter<HeroDetails.Edge1> {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField.forString("__typename", "__typename", null, false, null),
      ResponseField.forObject("node", "node", null, true, null)
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?): HeroDetails.Edge1 {
      return reader.run {
        var __typename: String? = __typename
        var node: HeroDetails.Node1? = null
        while(true) {
          when (selectField(RESPONSE_FIELDS)) {
            0 -> __typename = readString(RESPONSE_FIELDS[0])
            1 -> node = readObject<HeroDetails.Node1>(RESPONSE_FIELDS[1]) { reader ->
              Node1_ResponseAdapter.fromResponse(reader)
            }
            else -> break
          }
        }
        HeroDetails.Edge1(
          __typename = __typename!!,
          node = node
        )
      }
    }

    override fun toResponse(writer: ResponseWriter, value: HeroDetails.Edge1) {
      writer.writeString(RESPONSE_FIELDS[0], value.__typename)
      if(value.node == null) {
        writer.writeObject(RESPONSE_FIELDS[1], null)
      } else {
        writer.writeObject(RESPONSE_FIELDS[1]) {
          Node1_ResponseAdapter.toResponse(writer, value.node)
        }
      }
    }
  }

  object FriendsConnection1_ResponseAdapter : ResponseAdapter<HeroDetails.FriendsConnection1> {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField.forString("__typename", "__typename", null, false, null),
      ResponseField.forInt("totalCount", "totalCount", null, true, null),
      ResponseField.forList("edges", "edges", null, true, null)
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?):
        HeroDetails.FriendsConnection1 {
      return reader.run {
        var __typename: String? = __typename
        var totalCount: Int? = null
        var edges: List<HeroDetails.Edge1?>? = null
        while(true) {
          when (selectField(RESPONSE_FIELDS)) {
            0 -> __typename = readString(RESPONSE_FIELDS[0])
            1 -> totalCount = readInt(RESPONSE_FIELDS[1])
            2 -> edges = readList<HeroDetails.Edge1>(RESPONSE_FIELDS[2]) { reader ->
              reader.readObject<HeroDetails.Edge1> { reader ->
                Edge1_ResponseAdapter.fromResponse(reader)
              }
            }
            else -> break
          }
        }
        HeroDetails.FriendsConnection1(
          __typename = __typename!!,
          totalCount = totalCount,
          edges = edges
        )
      }
    }

    override fun toResponse(writer: ResponseWriter, value: HeroDetails.FriendsConnection1) {
      writer.writeString(RESPONSE_FIELDS[0], value.__typename)
      writer.writeInt(RESPONSE_FIELDS[1], value.totalCount)
      writer.writeList(RESPONSE_FIELDS[2], value.edges) { value, listItemWriter ->
        value?.forEach { value ->
          if(value == null) {
            listItemWriter.writeObject(null)
          } else {
            listItemWriter.writeObject {
              Edge1_ResponseAdapter.toResponse(writer, value)
            }
          }
        }
      }
    }
  }
}
