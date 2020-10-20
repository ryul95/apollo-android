// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.named_fragment_delegate.fragment

import com.apollographql.apollo.api.GraphqlFragment
import com.apollographql.apollo.api.internal.ResponseFieldMarshaller
import com.apollographql.apollo.api.internal.ResponseReader
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List

/**
 * A humanoid creature from the Star Wars universe
 */
@Suppress("NAME_SHADOWING", "UNUSED_ANONYMOUS_PARAMETER", "LocalVariableName",
    "RemoveExplicitTypeArguments", "NestedLambdaShadowedImplicitParameter", "PropertyName",
    "RemoveRedundantQualifierName")
interface HumanDetails : GraphqlFragment {
  val __typename: String

  /**
   * What this human calls themselves
   */
  val name: String

  /**
   * Profile link
   */
  val profileLink: Any

  /**
   * The friends of the human exposed as a connection with edges
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
      return ResponseFieldMarshaller { writer ->
        HumanDetails_ResponseAdapter.Node1_ResponseAdapter.toResponse(writer, this)
      }
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
      return ResponseFieldMarshaller { writer ->
        HumanDetails_ResponseAdapter.Edge1_ResponseAdapter.toResponse(writer, this)
      }
    }
  }

  /**
   * A connection object for a character's friends
   */
  data class FriendsConnection1(
    override val __typename: String = "FriendsConnection",
    /**
     * The edges for each of the character's friends.
     */
    override val edges: List<Edge1?>?
  ) : FriendsConnection {
    override fun marshaller(): ResponseFieldMarshaller {
      return ResponseFieldMarshaller { writer ->
        HumanDetails_ResponseAdapter.FriendsConnection1_ResponseAdapter.toResponse(writer, this)
      }
    }
  }

  /**
   * A humanoid creature from the Star Wars universe
   */
  data class DefaultImpl(
    override val __typename: String = "Human",
    /**
     * What this human calls themselves
     */
    override val name: String,
    /**
     * Profile link
     */
    override val profileLink: Any,
    /**
     * The friends of the human exposed as a connection with edges
     */
    override val friendsConnection: FriendsConnection1
  ) : HumanDetails {
    override fun marshaller(): ResponseFieldMarshaller {
      return ResponseFieldMarshaller { writer ->
        HumanDetails_ResponseAdapter.toResponse(writer, this)
      }
    }
  }

  companion object {
    val FRAGMENT_DEFINITION: String = """
        |fragment HumanDetails on Human {
        |  __typename
        |  name
        |  profileLink
        |  friendsConnection {
        |    __typename
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

    operator fun invoke(reader: ResponseReader): HumanDetails {
      return HumanDetails_ResponseAdapter.fromResponse(reader)
    }
  }
}
