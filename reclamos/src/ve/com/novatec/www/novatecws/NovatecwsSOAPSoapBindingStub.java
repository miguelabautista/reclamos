/**
 * NovatecwsSOAPSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ve.com.novatec.www.novatecws;

public class NovatecwsSOAPSoapBindingStub extends org.apache.axis.client.Stub implements ve.com.novatec.www.novatecws.Novatecws_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[7];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("check");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", "checkRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", ">checkRequest"), ve.com.novatec.www.novatecws.CheckRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", ">checkResponse"));
        oper.setReturnClass(ve.com.novatec.www.novatecws.CheckResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", "checkResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("buscarDocumentos");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", "buscarDocumentosRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", ">buscarDocumentosRequest"), ve.com.novatec.www.novatecws.BuscarDocumentosRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", ">buscarDocumentosResponse"));
        oper.setReturnClass(ve.com.novatec.www.novatecws.BuscarDocumentosResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", "buscarDocumentosResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obtenerDocumento");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", "obtenerDocumentoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", ">obtenerDocumentoRequest"), ve.com.novatec.www.novatecws.ObtenerDocumentoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", ">obtenerDocumentoResponse"));
        oper.setReturnClass(ve.com.novatec.www.novatecws.ObtenerDocumentoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", "obtenerDocumentoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("login");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", "loginRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", ">loginRequest"), ve.com.novatec.www.novatecws.LoginRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", ">loginResponse"));
        oper.setReturnClass(ve.com.novatec.www.novatecws.LoginResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", "loginResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("loginSimple");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", "loginSimpleRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", ">loginSimpleRequest"), ve.com.novatec.www.novatecws.LoginSimpleRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", ">loginSimpleResponse"));
        oper.setReturnClass(ve.com.novatec.www.novatecws.LoginSimpleResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", "loginSimpleResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("agregarDocumento");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", "agregarDocumentoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", ">agregarDocumentoRequest"), ve.com.novatec.www.novatecws.AgregarDocumentoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", ">agregarDocumentoResponse"));
        oper.setReturnClass(ve.com.novatec.www.novatecws.AgregarDocumentoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", "agregarDocumentoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("borrarDocumento");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", "borrarDocumentoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", ">borrarDocumentoRequest"), ve.com.novatec.www.novatecws.BorrarDocumentoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", ">borrarDocumentoResponse"));
        oper.setReturnClass(ve.com.novatec.www.novatecws.BorrarDocumentoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", "borrarDocumentoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

    }

    public NovatecwsSOAPSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public NovatecwsSOAPSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public NovatecwsSOAPSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", ">agregarDocumentoRequest");
            cachedSerQNames.add(qName);
            cls = ve.com.novatec.www.novatecws.AgregarDocumentoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", ">agregarDocumentoResponse");
            cachedSerQNames.add(qName);
            cls = ve.com.novatec.www.novatecws.AgregarDocumentoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", ">borrarDocumentoRequest");
            cachedSerQNames.add(qName);
            cls = ve.com.novatec.www.novatecws.BorrarDocumentoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", ">borrarDocumentoResponse");
            cachedSerQNames.add(qName);
            cls = ve.com.novatec.www.novatecws.BorrarDocumentoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", ">buscarDocumentosRequest");
            cachedSerQNames.add(qName);
            cls = ve.com.novatec.www.novatecws.BuscarDocumentosRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", ">buscarDocumentosResponse");
            cachedSerQNames.add(qName);
            cls = ve.com.novatec.www.novatecws.BuscarDocumentosResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", ">checkRequest");
            cachedSerQNames.add(qName);
            cls = ve.com.novatec.www.novatecws.CheckRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", ">checkResponse");
            cachedSerQNames.add(qName);
            cls = ve.com.novatec.www.novatecws.CheckResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", ">loginRequest");
            cachedSerQNames.add(qName);
            cls = ve.com.novatec.www.novatecws.LoginRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", ">loginResponse");
            cachedSerQNames.add(qName);
            cls = ve.com.novatec.www.novatecws.LoginResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", ">loginSimpleRequest");
            cachedSerQNames.add(qName);
            cls = ve.com.novatec.www.novatecws.LoginSimpleRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", ">loginSimpleResponse");
            cachedSerQNames.add(qName);
            cls = ve.com.novatec.www.novatecws.LoginSimpleResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", ">obtenerDocumentoRequest");
            cachedSerQNames.add(qName);
            cls = ve.com.novatec.www.novatecws.ObtenerDocumentoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", ">obtenerDocumentoResponse");
            cachedSerQNames.add(qName);
            cls = ve.com.novatec.www.novatecws.ObtenerDocumentoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", "ArrayOfDpDocumentInfoDTO");
            cachedSerQNames.add(qName);
            cls = ve.com.novatec.www.novatecws.DpDocumentInfoDTO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", "DpDocumentInfoDTO");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", "DpAddDocumentDTO");
            cachedSerQNames.add(qName);
            cls = ve.com.novatec.www.novatecws.DpAddDocumentDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", "DpDocTypeDTO");
            cachedSerQNames.add(qName);
            cls = ve.com.novatec.www.novatecws.DpDocTypeDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", "DpDocumentGenerarDTO");
            cachedSerQNames.add(qName);
            cls = ve.com.novatec.www.novatecws.DpDocumentGenerarDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", "DpDocumentInfoDTO");
            cachedSerQNames.add(qName);
            cls = ve.com.novatec.www.novatecws.DpDocumentInfoDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", "DpDocumentInfoGenerarDTO");
            cachedSerQNames.add(qName);
            cls = ve.com.novatec.www.novatecws.DpDocumentInfoGenerarDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", "DpFolderDTO");
            cachedSerQNames.add(qName);
            cls = ve.com.novatec.www.novatecws.DpFolderDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", "DpIndexDTO");
            cachedSerQNames.add(qName);
            cls = ve.com.novatec.www.novatecws.DpIndexDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", "DpIndexLoginDTO");
            cachedSerQNames.add(qName);
            cls = ve.com.novatec.www.novatecws.DpIndexLoginDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", "DpInfoLoginDTO");
            cachedSerQNames.add(qName);
            cls = ve.com.novatec.www.novatecws.DpInfoLoginDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", "DpMimeTypeDTO");
            cachedSerQNames.add(qName);
            cls = ve.com.novatec.www.novatecws.DpMimeTypeDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", "DpServicesConnectionDTO");
            cachedSerQNames.add(qName);
            cls = ve.com.novatec.www.novatecws.DpServicesConnectionDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", "DpUserDTO");
            cachedSerQNames.add(qName);
            cls = ve.com.novatec.www.novatecws.DpUserDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", "Indexes");
            cachedSerQNames.add(qName);
            cls = ve.com.novatec.www.novatecws.Indexes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public ve.com.novatec.www.novatecws.CheckResponse check(ve.com.novatec.www.novatecws.CheckRequest checkRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.novatec.com.ve/novatecws/check");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "check"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {checkRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ve.com.novatec.www.novatecws.CheckResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (ve.com.novatec.www.novatecws.CheckResponse) org.apache.axis.utils.JavaUtils.convert(_resp, ve.com.novatec.www.novatecws.CheckResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ve.com.novatec.www.novatecws.BuscarDocumentosResponse buscarDocumentos(ve.com.novatec.www.novatecws.BuscarDocumentosRequest buscarDocumentosRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.novatec.com.ve/novatecws/buscarDocumentos");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "buscarDocumentos"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {buscarDocumentosRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ve.com.novatec.www.novatecws.BuscarDocumentosResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (ve.com.novatec.www.novatecws.BuscarDocumentosResponse) org.apache.axis.utils.JavaUtils.convert(_resp, ve.com.novatec.www.novatecws.BuscarDocumentosResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ve.com.novatec.www.novatecws.ObtenerDocumentoResponse obtenerDocumento(ve.com.novatec.www.novatecws.ObtenerDocumentoRequest obtenerDocumentoRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.novatec.com.ve/novatecws/obtenerDocumento");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "obtenerDocumento"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {obtenerDocumentoRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ve.com.novatec.www.novatecws.ObtenerDocumentoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (ve.com.novatec.www.novatecws.ObtenerDocumentoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, ve.com.novatec.www.novatecws.ObtenerDocumentoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ve.com.novatec.www.novatecws.LoginResponse login(ve.com.novatec.www.novatecws.LoginRequest loginRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.novatec.com.ve/novatecws/login");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "login"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {loginRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ve.com.novatec.www.novatecws.LoginResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (ve.com.novatec.www.novatecws.LoginResponse) org.apache.axis.utils.JavaUtils.convert(_resp, ve.com.novatec.www.novatecws.LoginResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ve.com.novatec.www.novatecws.LoginSimpleResponse loginSimple(ve.com.novatec.www.novatecws.LoginSimpleRequest loginSimpleRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.novatec.com.ve/novatecws/loginSimple");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "loginSimple"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {loginSimpleRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ve.com.novatec.www.novatecws.LoginSimpleResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (ve.com.novatec.www.novatecws.LoginSimpleResponse) org.apache.axis.utils.JavaUtils.convert(_resp, ve.com.novatec.www.novatecws.LoginSimpleResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ve.com.novatec.www.novatecws.AgregarDocumentoResponse agregarDocumento(ve.com.novatec.www.novatecws.AgregarDocumentoRequest agregarDocumentoRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.novatec.com.ve/novatecws/agregarDocumento");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "agregarDocumento"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {agregarDocumentoRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ve.com.novatec.www.novatecws.AgregarDocumentoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (ve.com.novatec.www.novatecws.AgregarDocumentoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, ve.com.novatec.www.novatecws.AgregarDocumentoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ve.com.novatec.www.novatecws.BorrarDocumentoResponse borrarDocumento(ve.com.novatec.www.novatecws.BorrarDocumentoRequest borrarDocumentoRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.novatec.com.ve/novatecws/borrarDocumento");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "borrarDocumento"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {borrarDocumentoRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ve.com.novatec.www.novatecws.BorrarDocumentoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (ve.com.novatec.www.novatecws.BorrarDocumentoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, ve.com.novatec.www.novatecws.BorrarDocumentoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
