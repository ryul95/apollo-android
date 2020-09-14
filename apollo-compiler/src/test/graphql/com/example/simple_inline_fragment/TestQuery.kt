// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.simple_inline_fragment

import com.apollographql.apollo.api.Operation
import com.apollographql.apollo.api.OperationName
import com.apollographql.apollo.api.Query
import com.apollographql.apollo.api.Response
import com.apollographql.apollo.api.ResponseField
import com.apollographql.apollo.api.ScalarTypeAdapters
import com.apollographql.apollo.api.ScalarTypeAdapters.Companion.DEFAULT
import com.apollographql.apollo.api.internal.OperationRequestBodyComposer
import com.apollographql.apollo.api.internal.QueryDocumentMinifier
import com.apollographql.apollo.api.internal.ResponseFieldMapper
import com.apollographql.apollo.api.internal.ResponseFieldMarshaller
import com.apollographql.apollo.api.internal.ResponseReader
import com.apollographql.apollo.api.internal.SimpleOperationResponseParser
import com.apollographql.apollo.api.internal.Throws
import kotlin.Array
import kotlin.Boolean
import kotlin.Double
import kotlin.String
import kotlin.Suppress
import okio.Buffer
import okio.BufferedSource
import okio.ByteString
import okio.IOException

@Suppress("NAME_SHADOWING", "UNUSED_ANONYMOUS_PARAMETER", "LocalVariableName",
    "RemoveExplicitTypeArguments", "NestedLambdaShadowedImplicitParameter", "PropertyName",
    "RemoveRedundantQualifierName")
class TestQuery : Query<TestQuery.Data, TestQuery.Data, Operation.Variables> {
  override fun operationId(): String = OPERATION_ID
  override fun queryDocument(): String = QUERY_DOCUMENT
  override fun wrapData(data: Data?): Data? = data
  override fun variables(): Operation.Variables = Operation.EMPTY_VARIABLES
  override fun name(): OperationName = OPERATION_NAME
  override fun responseFieldMapper(): ResponseFieldMapper<Data> = ResponseFieldMapper.invoke {
    Data(it)
  }

  @Throws(IOException::class)
  override fun parse(source: BufferedSource, scalarTypeAdapters: ScalarTypeAdapters): Response<Data>
      = SimpleOperationResponseParser.parse(source, this, scalarTypeAdapters)

  @Throws(IOException::class)
  override fun parse(byteString: ByteString, scalarTypeAdapters: ScalarTypeAdapters): Response<Data>
      = parse(Buffer().write(byteString), scalarTypeAdapters)

  @Throws(IOException::class)
  override fun parse(source: BufferedSource): Response<Data> = parse(source, DEFAULT)

  @Throws(IOException::class)
  override fun parse(byteString: ByteString): Response<Data> = parse(byteString, DEFAULT)

  override fun composeRequestBody(scalarTypeAdapters: ScalarTypeAdapters): ByteString =
      OperationRequestBodyComposer.compose(
    operation = this,
    autoPersistQueries = false,
    withQueryDocument = true,
    scalarTypeAdapters = scalarTypeAdapters
  )

  override fun composeRequestBody(): ByteString = OperationRequestBodyComposer.compose(
    operation = this,
    autoPersistQueries = false,
    withQueryDocument = true,
    scalarTypeAdapters = DEFAULT
  )

  override fun composeRequestBody(
    autoPersistQueries: Boolean,
    withQueryDocument: Boolean,
    scalarTypeAdapters: ScalarTypeAdapters
  ): ByteString = OperationRequestBodyComposer.compose(
    operation = this,
    autoPersistQueries = autoPersistQueries,
    withQueryDocument = withQueryDocument,
    scalarTypeAdapters = scalarTypeAdapters
  )

  /**
   * A humanoid creature from the Star Wars universe
   */
  data class Human(
    /**
     * Height in the preferred unit, default is meters
     */
    val height: Double?,
    override val __typename: String = "Human",
    /**
     * The name of the character
     */
    override val name: String
  ) : Hero {
    override fun marshaller(): ResponseFieldMarshaller {
      return ResponseFieldMarshaller.invoke { writer ->
        writer.writeDouble(RESPONSE_FIELDS[0], this@Human.height)
        writer.writeString(RESPONSE_FIELDS[1], this@Human.__typename)
        writer.writeString(RESPONSE_FIELDS[2], this@Human.name)
      }
    }

    companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
        ResponseField.forDouble("height", "height", null, true, null),
        ResponseField.forString("__typename", "__typename", null, false, null),
        ResponseField.forString("name", "name", null, false, null)
      )

      operator fun invoke(reader: ResponseReader): Human = reader.run {
        val height = readDouble(RESPONSE_FIELDS[0])
        val __typename = readString(RESPONSE_FIELDS[1])!!
        val name = readString(RESPONSE_FIELDS[2])!!
        Human(
          height = height,
          __typename = __typename,
          name = name
        )
      }

      @Suppress("FunctionName")
      fun Mapper(): ResponseFieldMapper<Human> = ResponseFieldMapper { invoke(it) }
    }
  }

  /**
   * An autonomous mechanical character in the Star Wars universe
   */
  data class Droid(
    /**
     * This droid's primary function
     */
    val primaryFunction: String?,
    override val __typename: String = "Droid",
    /**
     * The name of the character
     */
    override val name: String
  ) : Hero {
    override fun marshaller(): ResponseFieldMarshaller {
      return ResponseFieldMarshaller.invoke { writer ->
        writer.writeString(RESPONSE_FIELDS[0], this@Droid.primaryFunction)
        writer.writeString(RESPONSE_FIELDS[1], this@Droid.__typename)
        writer.writeString(RESPONSE_FIELDS[2], this@Droid.name)
      }
    }

    companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
        ResponseField.forString("primaryFunction", "primaryFunction", null, true, null),
        ResponseField.forString("__typename", "__typename", null, false, null),
        ResponseField.forString("name", "name", null, false, null)
      )

      operator fun invoke(reader: ResponseReader): Droid = reader.run {
        val primaryFunction = readString(RESPONSE_FIELDS[0])
        val __typename = readString(RESPONSE_FIELDS[1])!!
        val name = readString(RESPONSE_FIELDS[2])!!
        Droid(
          primaryFunction = primaryFunction,
          __typename = __typename,
          name = name
        )
      }

      @Suppress("FunctionName")
      fun Mapper(): ResponseFieldMapper<Droid> = ResponseFieldMapper { invoke(it) }
    }
  }

  /**
   * A character from the Star Wars universe
   */
  data class HeroImpl(
    override val __typename: String = "Character",
    /**
     * The name of the character
     */
    override val name: String
  ) : Hero {
    override fun marshaller(): ResponseFieldMarshaller {
      return ResponseFieldMarshaller.invoke { writer ->
        writer.writeString(RESPONSE_FIELDS[0], this@HeroImpl.__typename)
        writer.writeString(RESPONSE_FIELDS[1], this@HeroImpl.name)
      }
    }

    companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
        ResponseField.forString("__typename", "__typename", null, false, null),
        ResponseField.forString("name", "name", null, false, null)
      )

      operator fun invoke(reader: ResponseReader): HeroImpl = reader.run {
        val __typename = readString(RESPONSE_FIELDS[0])!!
        val name = readString(RESPONSE_FIELDS[1])!!
        HeroImpl(
          __typename = __typename,
          name = name
        )
      }

      @Suppress("FunctionName")
      fun Mapper(): ResponseFieldMapper<HeroImpl> = ResponseFieldMapper { invoke(it) }
    }
  }

  /**
   * A character from the Star Wars universe
   */
  interface Hero {
    val __typename: String

    /**
     * The name of the character
     */
    val name: String

    fun marshaller(): ResponseFieldMarshaller

    companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
        ResponseField.forString("__typename", "__typename", null, false, null)
      )

      operator fun invoke(reader: ResponseReader): Hero {
        val typename = reader.readString(RESPONSE_FIELDS[0])
        return when(typename) {
          "Human" -> Human(reader)
          "Droid" -> Droid(reader)
          else -> HeroImpl(reader)
        }
      }
    }
  }

  /**
   * Data from the response after executing this GraphQL operation
   */
  data class Data(
    val hero: Hero?
  ) : Operation.Data {
    override fun marshaller(): ResponseFieldMarshaller {
      return ResponseFieldMarshaller.invoke { writer ->
        writer.writeObject(RESPONSE_FIELDS[0], this@Data.hero?.marshaller())
      }
    }

    companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
        ResponseField.forObject("hero", "hero", null, true, null)
      )

      operator fun invoke(reader: ResponseReader): Data = reader.run {
        val hero = readObject<Hero>(RESPONSE_FIELDS[0]) { reader ->
          Hero(reader)
        }
        Data(
          hero = hero
        )
      }

      @Suppress("FunctionName")
      fun Mapper(): ResponseFieldMapper<Data> = ResponseFieldMapper { invoke(it) }
    }
  }

  companion object {
    const val OPERATION_ID: String =
        "5474e96626eb1bd3adbb1a3bc28419597638a648778d634ed80a485b9586ec89"

    val QUERY_DOCUMENT: String = QueryDocumentMinifier.minify(
          """
          |query TestQuery {
          |  hero {
          |    __typename
          |    ... on Character {
          |      name
          |    }
          |    ... on Human {
          |      height
          |    }
          |    ... on Droid {
          |      primaryFunction
          |    }
          |  }
          |}
          """.trimMargin()
        )

    val OPERATION_NAME: OperationName = object : OperationName {
      override fun name(): String = "TestQuery"
    }
  }
}
