// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.inline_fragment_type_coercion

import com.apollographql.apollo.api.Operation
import com.apollographql.apollo.api.OperationName
import com.apollographql.apollo.api.Query
import com.apollographql.apollo.api.Response
import com.apollographql.apollo.api.ScalarTypeAdapters
import com.apollographql.apollo.api.ScalarTypeAdapters.Companion.DEFAULT
import com.apollographql.apollo.api.internal.OperationRequestBodyComposer
import com.apollographql.apollo.api.internal.QueryDocumentMinifier
import com.apollographql.apollo.api.internal.ResponseFieldMapper
import com.apollographql.apollo.api.internal.ResponseFieldMarshaller
import com.apollographql.apollo.api.internal.SimpleOperationResponseParser
import com.apollographql.apollo.api.internal.Throws
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import okio.Buffer
import okio.BufferedSource
import okio.ByteString
import okio.IOException

@Suppress("NAME_SHADOWING", "UNUSED_ANONYMOUS_PARAMETER", "LocalVariableName",
    "RemoveExplicitTypeArguments", "NestedLambdaShadowedImplicitParameter", "PropertyName",
    "RemoveRedundantQualifierName")
class TestQuery : Query<TestQuery.Data, Operation.Variables> {
  override fun operationId(): String = OPERATION_ID

  override fun queryDocument(): String = QUERY_DOCUMENT

  override fun variables(): Operation.Variables = Operation.EMPTY_VARIABLES

  override fun name(): OperationName = OPERATION_NAME

  override fun responseFieldMapper(): ResponseFieldMapper<Data> {
    return ResponseFieldMapper.invoke {
      TestQuery_ResponseAdapter.fromResponse(it)
    }
  }

  @Throws(IOException::class)
  override fun parse(source: BufferedSource, scalarTypeAdapters: ScalarTypeAdapters):
      Response<Data> {
    return SimpleOperationResponseParser.parse(source, this, scalarTypeAdapters)
  }

  @Throws(IOException::class)
  override fun parse(byteString: ByteString, scalarTypeAdapters: ScalarTypeAdapters):
      Response<Data> {
    return parse(Buffer().write(byteString), scalarTypeAdapters)
  }

  @Throws(IOException::class)
  override fun parse(source: BufferedSource): Response<Data> {
    return parse(source, DEFAULT)
  }

  @Throws(IOException::class)
  override fun parse(byteString: ByteString): Response<Data> {
    return parse(byteString, DEFAULT)
  }

  override fun composeRequestBody(scalarTypeAdapters: ScalarTypeAdapters): ByteString {
    return OperationRequestBodyComposer.compose(
      operation = this,
      autoPersistQueries = false,
      withQueryDocument = true,
      scalarTypeAdapters = scalarTypeAdapters
    )
  }

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
   * For testing fragment type coercion
   */
  data class Bar(
    override val __typename: String = "Bar",
    override val foo: String,
    val bar: String
  ) : Foo {
    override fun marshaller(): ResponseFieldMarshaller {
      return ResponseFieldMarshaller { writer ->
        TestQuery_ResponseAdapter.Bar_ResponseAdapter.toResponse(writer, this)
      }
    }
  }

  /**
   * For testing fragment type coercion
   */
  data class OtherFoo(
    override val __typename: String = "Foo",
    override val foo: String
  ) : Foo {
    override fun marshaller(): ResponseFieldMarshaller {
      return ResponseFieldMarshaller { writer ->
        TestQuery_ResponseAdapter.OtherFoo_ResponseAdapter.toResponse(writer, this)
      }
    }
  }

  /**
   * For testing fragment type coercion
   */
  interface Foo {
    val __typename: String

    val foo: String

    fun asBar(): Bar? = this as? Bar

    fun marshaller(): ResponseFieldMarshaller
  }

  /**
   * Data from the response after executing this GraphQL operation
   */
  data class Data(
    /**
     * For testing fragment type coercion
     */
    val foo: Foo?
  ) : Operation.Data {
    override fun marshaller(): ResponseFieldMarshaller {
      return ResponseFieldMarshaller { writer ->
        TestQuery_ResponseAdapter.toResponse(writer, this)
      }
    }
  }

  companion object {
    const val OPERATION_ID: String =
        "65c4fd857f5cbd2283f0783a3b3cefd9ead5abb159f5cc20922b0d8e04286662"

    val QUERY_DOCUMENT: String = QueryDocumentMinifier.minify(
          """
          |query TestQuery {
          |  foo {
          |    __typename
          |    foo
          |    ... on Bar {
          |      bar
          |    }
          |  }
          |}
          """.trimMargin()
        )

    val OPERATION_NAME: OperationName = object : OperationName {
      override fun name(): String {
        return "TestQuery"
      }
    }
  }
}
