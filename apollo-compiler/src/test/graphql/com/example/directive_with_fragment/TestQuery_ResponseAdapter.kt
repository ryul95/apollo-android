// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.directive_with_fragment

import com.apollographql.apollo.api.ResponseField
import com.apollographql.apollo.api.internal.ResponseAdapter
import com.apollographql.apollo.api.internal.ResponseReader
import com.apollographql.apollo.api.internal.ResponseWriter
import com.example.directive_with_fragment.type.CustomType
import kotlin.Array
import kotlin.String
import kotlin.Suppress

@Suppress("NAME_SHADOWING", "UNUSED_ANONYMOUS_PARAMETER", "LocalVariableName",
    "RemoveExplicitTypeArguments", "NestedLambdaShadowedImplicitParameter", "PropertyName",
    "RemoveRedundantQualifierName")
internal object TestQuery_ResponseAdapter : ResponseAdapter<TestQuery.Data> {
  private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
    ResponseField.forObject("hero", "hero", null, true, null)
  )

  override fun fromResponse(reader: ResponseReader, __typename: String?): TestQuery.Data {
    return reader.run {
      var hero: TestQuery.Hero? = null
      while(true) {
        when (selectField(RESPONSE_FIELDS)) {
          0 -> hero = readObject<TestQuery.Hero>(RESPONSE_FIELDS[0]) { reader ->
            TestQuery_ResponseAdapter.Hero_ResponseAdapter.fromResponse(reader)
          }
          else -> break
        }
      }
      TestQuery.Data(
        hero = hero
      )
    }
  }

  override fun toResponse(writer: ResponseWriter, value: TestQuery.Data) {
    if(value.hero == null) {
      writer.writeObject(RESPONSE_FIELDS[0], null)
    } else {
      writer.writeObject(RESPONSE_FIELDS[0]) {
        TestQuery_ResponseAdapter.Hero_ResponseAdapter.toResponse(writer, value.hero)
      }
    }
  }

  object HeroDetailsImpl_ResponseAdapter : ResponseAdapter<TestQuery.HeroDetailsImpl> {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField.forString("__typename", "__typename", null, false, null),
      ResponseField.forString("name", "name", null, false, null),
      ResponseField.forCustomType("id", "id", null, false, CustomType.ID, null)
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?):
        TestQuery.HeroDetailsImpl {
      return reader.run {
        var __typename: String? = __typename
        var name: String? = null
        var id: String? = null
        while(true) {
          when (selectField(RESPONSE_FIELDS)) {
            0 -> __typename = readString(RESPONSE_FIELDS[0])
            1 -> name = readString(RESPONSE_FIELDS[1])
            2 -> id = readCustomType<String>(RESPONSE_FIELDS[2] as ResponseField.CustomTypeField)
            else -> break
          }
        }
        TestQuery.HeroDetailsImpl(
          __typename = __typename!!,
          name = name!!,
          id = id!!
        )
      }
    }

    override fun toResponse(writer: ResponseWriter, value: TestQuery.HeroDetailsImpl) {
      writer.writeString(RESPONSE_FIELDS[0], value.__typename)
      writer.writeString(RESPONSE_FIELDS[1], value.name)
      writer.writeCustom(RESPONSE_FIELDS[2] as ResponseField.CustomTypeField, value.id)
    }
  }

  object HeroDetailsHumanDetailsImpl_ResponseAdapter :
      ResponseAdapter<TestQuery.HeroDetailsHumanDetailsImpl> {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField.forString("__typename", "__typename", null, false, null),
      ResponseField.forString("name", "name", null, false, null),
      ResponseField.forString("homePlanet", "homePlanet", null, true, null),
      ResponseField.forCustomType("id", "id", null, false, CustomType.ID, null)
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?):
        TestQuery.HeroDetailsHumanDetailsImpl {
      return reader.run {
        var __typename: String? = __typename
        var name: String? = null
        var homePlanet: String? = null
        var id: String? = null
        while(true) {
          when (selectField(RESPONSE_FIELDS)) {
            0 -> __typename = readString(RESPONSE_FIELDS[0])
            1 -> name = readString(RESPONSE_FIELDS[1])
            2 -> homePlanet = readString(RESPONSE_FIELDS[2])
            3 -> id = readCustomType<String>(RESPONSE_FIELDS[3] as ResponseField.CustomTypeField)
            else -> break
          }
        }
        TestQuery.HeroDetailsHumanDetailsImpl(
          __typename = __typename!!,
          name = name!!,
          homePlanet = homePlanet,
          id = id!!
        )
      }
    }

    override fun toResponse(writer: ResponseWriter, value: TestQuery.HeroDetailsHumanDetailsImpl) {
      writer.writeString(RESPONSE_FIELDS[0], value.__typename)
      writer.writeString(RESPONSE_FIELDS[1], value.name)
      writer.writeString(RESPONSE_FIELDS[2], value.homePlanet)
      writer.writeCustom(RESPONSE_FIELDS[3] as ResponseField.CustomTypeField, value.id)
    }
  }

  object OtherHero_ResponseAdapter : ResponseAdapter<TestQuery.OtherHero> {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField.forString("__typename", "__typename", null, false, null),
      ResponseField.forCustomType("id", "id", null, false, CustomType.ID, null)
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?): TestQuery.OtherHero {
      return reader.run {
        var __typename: String? = __typename
        var id: String? = null
        while(true) {
          when (selectField(RESPONSE_FIELDS)) {
            0 -> __typename = readString(RESPONSE_FIELDS[0])
            1 -> id = readCustomType<String>(RESPONSE_FIELDS[1] as ResponseField.CustomTypeField)
            else -> break
          }
        }
        TestQuery.OtherHero(
          __typename = __typename!!,
          id = id!!
        )
      }
    }

    override fun toResponse(writer: ResponseWriter, value: TestQuery.OtherHero) {
      writer.writeString(RESPONSE_FIELDS[0], value.__typename)
      writer.writeCustom(RESPONSE_FIELDS[1] as ResponseField.CustomTypeField, value.id)
    }
  }

  object Hero_ResponseAdapter : ResponseAdapter<TestQuery.Hero> {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField.forString("__typename", "__typename", null, false, null),
      ResponseField.forCustomType("id", "id", null, false, CustomType.ID, null)
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?): TestQuery.Hero {
      val typename = __typename ?: reader.readString(RESPONSE_FIELDS[0])
      return when(typename) {
        "Droid" -> TestQuery_ResponseAdapter.HeroDetailsImpl_ResponseAdapter.fromResponse(reader, typename)
        "Human" -> TestQuery_ResponseAdapter.HeroDetailsHumanDetailsImpl_ResponseAdapter.fromResponse(reader, typename)
        else -> TestQuery_ResponseAdapter.OtherHero_ResponseAdapter.fromResponse(reader, typename)
      }
    }

    override fun toResponse(writer: ResponseWriter, value: TestQuery.Hero) {
      when(value) {
        is TestQuery.HeroDetailsImpl -> TestQuery_ResponseAdapter.HeroDetailsImpl_ResponseAdapter.toResponse(writer, value)
        is TestQuery.HeroDetailsHumanDetailsImpl -> TestQuery_ResponseAdapter.HeroDetailsHumanDetailsImpl_ResponseAdapter.toResponse(writer, value)
        is TestQuery.OtherHero -> TestQuery_ResponseAdapter.OtherHero_ResponseAdapter.toResponse(writer, value)
      }
    }
  }
}
