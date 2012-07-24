/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.cloudera.branchreduce.impl.thrift;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WorkResponse implements org.apache.thrift.TBase<WorkResponse, WorkResponse._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("WorkResponse");

  private static final org.apache.thrift.protocol.TField TASKS_FIELD_DESC = new org.apache.thrift.protocol.TField("tasks", org.apache.thrift.protocol.TType.LIST, (short)1);

  public List<ByteBuffer> tasks;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TASKS((short)1, "tasks");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TASKS
          return TASKS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TASKS, new org.apache.thrift.meta_data.FieldMetaData("tasks", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING            , true))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(WorkResponse.class, metaDataMap);
  }

  public WorkResponse() {
  }

  public WorkResponse(
    List<ByteBuffer> tasks)
  {
    this();
    this.tasks = tasks;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public WorkResponse(WorkResponse other) {
    if (other.isSetTasks()) {
      List<ByteBuffer> __this__tasks = new ArrayList<ByteBuffer>();
      for (ByteBuffer other_element : other.tasks) {
        ByteBuffer temp_binary_element = org.apache.thrift.TBaseHelper.copyBinary(other_element);
;
        __this__tasks.add(temp_binary_element);
      }
      this.tasks = __this__tasks;
    }
  }

  public WorkResponse deepCopy() {
    return new WorkResponse(this);
  }

  @Override
  public void clear() {
    this.tasks = null;
  }

  public int getTasksSize() {
    return (this.tasks == null) ? 0 : this.tasks.size();
  }

  public java.util.Iterator<ByteBuffer> getTasksIterator() {
    return (this.tasks == null) ? null : this.tasks.iterator();
  }

  public void addToTasks(ByteBuffer elem) {
    if (this.tasks == null) {
      this.tasks = new ArrayList<ByteBuffer>();
    }
    this.tasks.add(elem);
  }

  public List<ByteBuffer> getTasks() {
    return this.tasks;
  }

  public WorkResponse setTasks(List<ByteBuffer> tasks) {
    this.tasks = tasks;
    return this;
  }

  public void unsetTasks() {
    this.tasks = null;
  }

  /** Returns true if field tasks is set (has been assigned a value) and false otherwise */
  public boolean isSetTasks() {
    return this.tasks != null;
  }

  public void setTasksIsSet(boolean value) {
    if (!value) {
      this.tasks = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TASKS:
      if (value == null) {
        unsetTasks();
      } else {
        setTasks((List<ByteBuffer>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TASKS:
      return getTasks();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TASKS:
      return isSetTasks();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof WorkResponse)
      return this.equals((WorkResponse)that);
    return false;
  }

  public boolean equals(WorkResponse that) {
    if (that == null)
      return false;

    boolean this_present_tasks = true && this.isSetTasks();
    boolean that_present_tasks = true && that.isSetTasks();
    if (this_present_tasks || that_present_tasks) {
      if (!(this_present_tasks && that_present_tasks))
        return false;
      if (!this.tasks.equals(that.tasks))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(WorkResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    WorkResponse typedOther = (WorkResponse)other;

    lastComparison = Boolean.valueOf(isSetTasks()).compareTo(typedOther.isSetTasks());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTasks()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tasks, typedOther.tasks);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    org.apache.thrift.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // TASKS
          if (field.type == org.apache.thrift.protocol.TType.LIST) {
            {
              org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
              this.tasks = new ArrayList<ByteBuffer>(_list0.size);
              for (int _i1 = 0; _i1 < _list0.size; ++_i1)
              {
                ByteBuffer _elem2;
                _elem2 = iprot.readBinary();
                this.tasks.add(_elem2);
              }
              iprot.readListEnd();
            }
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.tasks != null) {
      oprot.writeFieldBegin(TASKS_FIELD_DESC);
      {
        oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, this.tasks.size()));
        for (ByteBuffer _iter3 : this.tasks)
        {
          oprot.writeBinary(_iter3);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("WorkResponse(");
    boolean first = true;

    sb.append("tasks:");
    if (this.tasks == null) {
      sb.append("null");
    } else {
      sb.append(this.tasks);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

}

