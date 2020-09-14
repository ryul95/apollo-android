// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.fragment_with_inline_fragment.fragment

import com.apollographql.apollo.api.GraphqlFragment
import com.apollographql.apollo.api.ResponseField
import com.apollographql.apollo.api.internal.ResponseFieldMapper
import com.apollographql.apollo.api.internal.ResponseFieldMarshaller
import com.apollographql.apollo.api.internal.ResponseReader
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List

/**
 * A character from the Star Wars universe
 */
@Suppress("NAME_SHADOWING", "UNUSED_ANONYMOUS_PARAMETER", "LocalVariableName",
    "RemoveExplicitTypeArguments", "NestedLambdaShadowedImplicitParameter", "PropertyName",
    "RemoveRedundantQualifierName")
interface HeroDetails : GraphqlFragment {
  val __typename: String

  /**
   * The name of the character
   */
  val name: String

  /**
   * The friends of the character exposed as a connection with edges
   */
  val friendsConnection: FriendsConnection

  /**
   * A character from the Star Wars universe
   */
  interface Node {
    val __typename: String

    /**
     * The name of the character
     */
    val name: String

    fun marshaller(): ResponseFieldMarshaller
  }

  /**
   * An edge object for a character's friends
   */
  interface Edge {
    val __typename: String

    /**
     * The character represented by this friendship edge
     */
    val node: Node?

    fun marshaller(): ResponseFieldMarshaller
  }

  /**
   * A connection object for a character's friends
   */
  interface FriendsConnection {
    val __typename: String

    /**
     * The total number of friends
     */
    val totalCount: Int?

    /**
     * The edges for each of the character's friends.
     */
    val edges: List<Edge?>?

    fun marshaller(): ResponseFieldMarshaller
  }

  /**
   * A character from the Star Wars universe
   */
  data class Node1(
    override val __typename: String = "Character",
    /**
     * The name of the character
     */
    override val name: String
  ) : Node {
    override fun marshaller(): ResponseFieldMarshaller {
      return ResponseFieldMarshaller.invoke { writer ->
        writer.writeString(RESPONSE_FIELDS[0], this@Node1.__typename)
        writer.writeString(RESPONSE_FIELDS[1], this@Node1.name)
      }
    }

    companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
        ResponseField.forString("__typename", "__typename", null, false, null),
        ResponseField.forString("name", "name", null, false, null)
      )

      operator fun invoke(reader: ResponseReader): Node1 = reader.run {
        val __typename = readString(RESPONSE_FIELDS[0])!!
        val name = readString(RESPONSE_FIELDS[1])!!
        Node1(
          __typename = __typename,
          name = name
        )
      }

      @Suppress("FunctionName")
      fun Mapper(): ResponseFieldMapper<Node1> = ResponseFieldMapper { invoke(it) }
    }
  }

  /**
   * An edge object for a character's friends
   */
  data class Edge1(
    override val __typename: String = "FriendsEdge",
    /**
     * The character represented by this friendship edge
     */
    override val node: Node1?
  ) : Edge {
    override fun marshaller(): ResponseFieldMarshaller {
      return ResponseFieldMarshaller.invoke { writer ->
        writer.writeString(RESPONSE_FIELDS[0], this@Edge1.__typename)
        writer.writeObject(RESPONSE_FIELDS[1], this@Edge1.node?.marshaller())
      }
    }

    companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
        ResponseField.forString("__typename", "__typename", null, false, null),
        ResponseField.forObject("node", "node", null, true, null)
      )

      operator fun invoke(reader: ResponseReader): Edge1 = reader.run {
        val __typename = readString(RESPONSE_FIELDS[0])!!
        val node = readObject<Node1>(RESPONSE_FIELDS[1]) { reader ->
          Node1(reader)
        }
        Edge1(
          __typename = __typename,
          node = node
        )
      }

      @Suppress("FunctionName")
      fun Mapper(): ResponseFieldMapper<Edge1> = ResponseFieldMapper { invoke(it) }
    }
  }

  /**
   * A connection object for a character's friends
   */
  data class FriendsConnection1(
    override val __typename: String = "FriendsConnection",
    /**
     * The total number of friends
     */
    override val totalCount: Int?,
    /**
     * The edges for each of the character's friends.
     */
    override val edges: List<Edge1?>?
  ) : FriendsConnection {
    override fun marshaller(): ResponseFieldMarshaller {
      return ResponseFieldMarshaller.invoke { writer ->
        writer.writeString(RESPONSE_FIELDS[0], this@FriendsConnection1.__typename)
        writer.writeInt(RESPONSE_FIELDS[1], this@FriendsConnection1.totalCount)
        writer.writeList(RESPONSE_FIELDS[2],
            this@FriendsConnection1.edges) { value, listItemWriter ->
          value?.forEach { value ->
            listItemWriter.writeObject(value?.marshaller())}
        }
      }
    }

    companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
        ResponseField.forString("__typename", "__typename", null, false, null),
        ResponseField.forInt("totalCount", "totalCount", null, true, null),
        ResponseField.forList("edges", "edges", null, true, null)
      )

      operator fun invoke(reader: ResponseReader): FriendsConnection1 = reader.run {
        val __typename = readString(RESPONSE_FIELDS[0])!!
        val totalCount = readInt(RESPONSE_FIELDS[1])
        val edges = readList<Edge1>(RESPONSE_FIELDS[2]) { reader ->
          reader.readObject<Edge1> { reader ->
            Edge1(reader)
          }
        }
        FriendsConnection1(
          __typename = __typename,
          totalCount = totalCount,
          edges = edges
        )
      }

      @Suppress("FunctionName")
      fun Mapper(): ResponseFieldMapper<FriendsConnection1> = ResponseFieldMapper { invoke(it) }
    }
  }

  /**
   * A character from the Star Wars universe
   */
  data class DefaultImpl(
    override val __typename: String = "Character",
    /**
     * The name of the character
     */
    override val name: String,
    /**
     * The friends of the character exposed as a connection with edges
     */
    override val friendsConnection: FriendsConnection1
  ) : HeroDetails {
    override fun marshaller(): ResponseFieldMarshaller {
      return ResponseFieldMarshaller.invoke { writer ->
        writer.writeString(RESPONSE_FIELDS[0], this@DefaultImpl.__typename)
        writer.writeString(RESPONSE_FIELDS[1], this@DefaultImpl.name)
        writer.writeObject(RESPONSE_FIELDS[2], this@DefaultImpl.friendsConnection.marshaller())
      }
    }

    companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
        ResponseField.forString("__typename", "__typename", null, false, null),
        ResponseField.forString("name", "name", null, false, null),
        ResponseField.forObject("friendsConnection", "friendsConnection", null, false, null)
      )

      operator fun invoke(reader: ResponseReader): DefaultImpl = reader.run {
        val __typename = readString(RESPONSE_FIELDS[0])!!
        val name = readString(RESPONSE_FIELDS[1])!!
        val friendsConnection = readObject<FriendsConnection1>(RESPONSE_FIELDS[2]) { reader ->
          FriendsConnection1(reader)
        }!!
        DefaultImpl(
          __typename = __typename,
          name = name,
          friendsConnection = friendsConnection
        )
      }

      @Suppress("FunctionName")
      fun Mapper(): ResponseFieldMapper<DefaultImpl> = ResponseFieldMapper { invoke(it) }
    }
  }

  companion object {
    val FRAGMENT_DEFINITION: String = """
        |fragment HeroDetails on Character {
        |  __typename
        |  ... HumanDetails
        |  ... on Droid {
        |    ...DroidDetails
        |  }
        |  name
        |  friendsConnection {
        |    __typename
        |    totalCount
        |    edges {
        |      __typename
        |      node {
        |        __typename
        |        name
        |      }
        |    }
        |  }
        |}
        """.trimMargin()

    operator fun invoke(
      __typename: String,
      name: String,
      friendsConnection: FriendsConnection1
    ): HeroDetails {
      return DefaultImpl(
        __typename = __typename,
        name = name,
        friendsConnection = friendsConnection
      )
    }

    operator fun invoke(reader: ResponseReader): HeroDetails = DefaultImpl(reader)
  }
}
