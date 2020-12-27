// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g 2020-12-23 02:26:58

    package org.apache.cassandra.cql3;

    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.Collections;
    import java.util.EnumSet;
    import java.util.HashMap;
    import java.util.LinkedHashMap;
    import java.util.List;
    import java.util.Map;
    import java.util.Set;

    import org.apache.cassandra.auth.Permission;
    import org.apache.cassandra.auth.DataResource;
    import org.apache.cassandra.auth.IResource;
    import org.apache.cassandra.cql3.*;
    import org.apache.cassandra.cql3.statements.*;
    import org.apache.cassandra.cql3.functions.FunctionCall;
    import org.apache.cassandra.db.marshal.CollectionType;
    import org.apache.cassandra.exceptions.ConfigurationException;
    import org.apache.cassandra.exceptions.InvalidRequestException;
    import org.apache.cassandra.exceptions.SyntaxException;
    import org.apache.cassandra.utils.Pair;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class CqlParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "K_USE", "K_SELECT", "K_DISTINCT", "K_COUNT", "K_AS", "K_FROM", "K_WHERE", "K_ORDER", "K_BY", "K_LIMIT", "K_ALLOW", "K_FILTERING", "K_WRITETIME", "K_TTL", "INTEGER", "K_AND", "K_ASC", "K_DESC", "K_INSERT", "K_INTO", "K_VALUES", "K_IF", "K_NOT", "K_EXISTS", "K_USING", "K_TIMESTAMP", "K_UPDATE", "K_SET", "K_DELETE", "K_BEGIN", "K_UNLOGGED", "K_COUNTER", "K_BATCH", "K_APPLY", "K_CREATE", "K_KEYSPACE", "K_WITH", "K_COLUMNFAMILY", "K_STATIC", "K_PRIMARY", "K_KEY", "K_COMPACT", "K_STORAGE", "K_CLUSTERING", "K_CUSTOM", "K_INDEX", "IDENT", "K_ON", "STRING_LITERAL", "K_TRIGGER", "K_DROP", "K_ALTER", "K_TYPE", "K_ADD", "K_RENAME", "K_TO", "K_TRUNCATE", "K_GRANT", "K_REVOKE", "K_LIST", "K_OF", "K_NORECURSIVE", "K_MODIFY", "K_AUTHORIZE", "K_ALL", "K_PERMISSIONS", "K_PERMISSION", "K_KEYSPACES", "K_USER", "K_SUPERUSER", "K_NOSUPERUSER", "K_USERS", "K_PASSWORD", "QUOTED_NAME", "QMARK", "FLOAT", "BOOLEAN", "UUID", "HEXNUMBER", "K_NAN", "K_INFINITY", "K_NULL", "K_TOKEN", "K_IN", "K_ASCII", "K_BIGINT", "K_BLOB", "K_BOOLEAN", "K_DECIMAL", "K_DOUBLE", "K_FLOAT", "K_INET", "K_INT", "K_TEXT", "K_UUID", "K_VARCHAR", "K_VARINT", "K_TIMEUUID", "K_MAP", "S", "E", "L", "C", "T", "F", "R", "O", "M", "A", "W", "H", "N", "D", "K", "Y", "I", "U", "P", "G", "B", "X", "V", "Z", "J", "Q", "DIGIT", "LETTER", "HEX", "EXPONENT", "WS", "COMMENT", "MULTILINE_COMMENT", "';'", "'('", "')'", "','", "'\\*'", "'['", "']'", "'.'", "'-'", "'{'", "':'", "'}'", "'='", "'+'", "'<'", "'<='", "'>'", "'>='"
    };
    public static final int T__144=144;
    public static final int T__143=143;
    public static final int K_COMPACT=45;
    public static final int T__146=146;
    public static final int T__145=145;
    public static final int K_SET=31;
    public static final int T__140=140;
    public static final int HEXNUMBER=82;
    public static final int K_MAP=102;
    public static final int T__142=142;
    public static final int K_KEY=44;
    public static final int K_INDEX=49;
    public static final int T__141=141;
    public static final int QMARK=78;
    public static final int K_KEYSPACES=71;
    public static final int K_ASC=20;
    public static final int K_CREATE=38;
    public static final int K_APPLY=37;
    public static final int K_USING=28;
    public static final int K_PASSWORD=76;
    public static final int MULTILINE_COMMENT=135;
    public static final int T__137=137;
    public static final int T__136=136;
    public static final int T__139=139;
    public static final int T__138=138;
    public static final int K_SUPERUSER=73;
    public static final int K_STATIC=42;
    public static final int K_UNLOGGED=34;
    public static final int QUOTED_NAME=77;
    public static final int K_ORDER=11;
    public static final int K_DROP=54;
    public static final int K_CLUSTERING=47;
    public static final int K_USE=4;
    public static final int K_VARINT=100;
    public static final int K_NORECURSIVE=65;
    public static final int A=112;
    public static final int B=123;
    public static final int C=106;
    public static final int K_BLOB=90;
    public static final int D=116;
    public static final int K_ALTER=55;
    public static final int K_PERMISSIONS=69;
    public static final int E=104;
    public static final int K_LIMIT=13;
    public static final int K_INSERT=22;
    public static final int F=108;
    public static final int G=122;
    public static final int H=114;
    public static final int K_FROM=9;
    public static final int I=119;
    public static final int K_PRIMARY=43;
    public static final int K_NAN=83;
    public static final int J=127;
    public static final int K_LIST=63;
    public static final int K=117;
    public static final int L=105;
    public static final int K_BIGINT=89;
    public static final int M=111;
    public static final int N=115;
    public static final int COMMENT=134;
    public static final int O=110;
    public static final int K_INET=95;
    public static final int P=121;
    public static final int Q=128;
    public static final int R=109;
    public static final int K_DESC=21;
    public static final int S=103;
    public static final int T=107;
    public static final int U=120;
    public static final int V=125;
    public static final int K_BOOLEAN=91;
    public static final int W=113;
    public static final int X=124;
    public static final int Y=118;
    public static final int Z=126;
    public static final int K_USER=72;
    public static final int T__151=151;
    public static final int K_WITH=40;
    public static final int T__150=150;
    public static final int T__153=153;
    public static final int T__152=152;
    public static final int K_OF=64;
    public static final int K_MODIFY=66;
    public static final int K_DECIMAL=92;
    public static final int K_VARCHAR=99;
    public static final int K_STORAGE=46;
    public static final int K_ON=51;
    public static final int K_UUID=98;
    public static final int K_ALLOW=14;
    public static final int K_CUSTOM=48;
    public static final int K_VALUES=24;
    public static final int K_BATCH=36;
    public static final int K_ASCII=88;
    public static final int EXPONENT=132;
    public static final int T__148=148;
    public static final int T__147=147;
    public static final int K_INFINITY=84;
    public static final int K_DELETE=32;
    public static final int T__149=149;
    public static final int LETTER=130;
    public static final int K_AS=8;
    public static final int K_FILTERING=15;
    public static final int K_SELECT=5;
    public static final int K_INTO=23;
    public static final int K_WRITETIME=16;
    public static final int K_AND=19;
    public static final int K_USERS=75;
    public static final int K_COLUMNFAMILY=41;
    public static final int K_TTL=17;
    public static final int K_GRANT=61;
    public static final int K_INT=96;
    public static final int K_COUNTER=35;
    public static final int K_AUTHORIZE=67;
    public static final int UUID=81;
    public static final int K_COUNT=7;
    public static final int INTEGER=18;
    public static final int K_TRIGGER=53;
    public static final int K_TIMESTAMP=29;
    public static final int K_NULL=85;
    public static final int K_WHERE=10;
    public static final int BOOLEAN=80;
    public static final int K_REVOKE=62;
    public static final int K_TIMEUUID=101;
    public static final int K_TOKEN=86;
    public static final int K_IF=25;
    public static final int K_DISTINCT=6;
    public static final int K_DOUBLE=93;
    public static final int K_PERMISSION=70;
    public static final int K_IN=87;
    public static final int K_ADD=57;
    public static final int K_ALL=68;
    public static final int FLOAT=79;
    public static final int K_FLOAT=94;
    public static final int K_UPDATE=30;
    public static final int K_BEGIN=33;
    public static final int K_TO=59;
    public static final int K_TRUNCATE=60;
    public static final int WS=133;
    public static final int EOF=-1;
    public static final int K_NOSUPERUSER=74;
    public static final int K_BY=12;
    public static final int DIGIT=129;
    public static final int K_EXISTS=27;
    public static final int K_NOT=26;
    public static final int K_TYPE=56;
    public static final int IDENT=50;
    public static final int K_RENAME=58;
    public static final int STRING_LITERAL=52;
    public static final int HEX=131;
    public static final int K_TEXT=97;
    public static final int K_KEYSPACE=39;

    // delegates
    // delegators


        public CqlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public CqlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return CqlParser.tokenNames; }
    public String getGrammarFileName() { return "/home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g"; }


        private final List<String> recognitionErrors = new ArrayList<String>();
        private final List<ColumnIdentifier> bindVariables = new ArrayList<ColumnIdentifier>();

        public AbstractMarker.Raw newBindVariables(ColumnIdentifier name)
        {
            AbstractMarker.Raw marker = new AbstractMarker.Raw(bindVariables.size());
            bindVariables.add(name);
            return marker;
        }

        public AbstractMarker.INRaw newINBindVariables(ColumnIdentifier name)
        {
            AbstractMarker.INRaw marker = new AbstractMarker.INRaw(bindVariables.size());
            bindVariables.add(name);
            return marker;
        }

        public Tuples.Raw newTupleBindVariables(ColumnIdentifier name)
        {
            Tuples.Raw marker = new Tuples.Raw(bindVariables.size());
            bindVariables.add(name);
            return marker;
        }

        public Tuples.INRaw newTupleINBindVariables(ColumnIdentifier name)
        {
            Tuples.INRaw marker = new Tuples.INRaw(bindVariables.size());
            bindVariables.add(name);
            return marker;
        }

        public void displayRecognitionError(String[] tokenNames, RecognitionException e)
        {
            String hdr = getErrorHeader(e);
            String msg = getErrorMessage(e, tokenNames);
            recognitionErrors.add(hdr + " " + msg);
        }

        public void addRecognitionError(String msg)
        {
            recognitionErrors.add(msg);
        }

        public List<String> getRecognitionErrors()
        {
            return recognitionErrors;
        }

        public void throwLastRecognitionError() throws SyntaxException
        {
            if (recognitionErrors.size() > 0)
                throw new SyntaxException(recognitionErrors.get((recognitionErrors.size()-1)));
        }

        public Map<String, String> convertPropertyMap(Maps.Literal map)
        {
            if (map == null || map.entries == null || map.entries.isEmpty())
                return Collections.<String, String>emptyMap();

            Map<String, String> res = new HashMap<String, String>(map.entries.size());

            for (Pair<Term.Raw, Term.Raw> entry : map.entries)
            {
                // Because the parser tries to be smart and recover on error (to
                // allow displaying more than one error I suppose), we have null
                // entries in there. Just skip those, a proper error will be thrown in the end.
                if (entry.left == null || entry.right == null)
                    break;

                if (!(entry.left instanceof Constants.Literal))
                {
                    String msg = "Invalid property name: " + entry.left;
                    if (entry.left instanceof AbstractMarker.Raw)
                        msg += " (bind variables are not supported in DDL queries)";
                    addRecognitionError(msg);
                    break;
                }
                if (!(entry.right instanceof Constants.Literal))
                {
                    String msg = "Invalid property value: " + entry.right + " for property: " + entry.left;
                    if (entry.right instanceof AbstractMarker.Raw)
                        msg += " (bind variables are not supported in DDL queries)";
                    addRecognitionError(msg);
                    break;
                }

                res.put(((Constants.Literal)entry.left).getRawText(), ((Constants.Literal)entry.right).getRawText());
            }

            return res;
        }

        public void addRawUpdate(List<Pair<ColumnIdentifier.Raw, Operation.RawUpdate>> operations, ColumnIdentifier.Raw key, Operation.RawUpdate update)
        {
            for (Pair<ColumnIdentifier.Raw, Operation.RawUpdate> p : operations)
            {
                if (p.left.equals(key) && !p.right.isCompatibleWith(update))
                    addRecognitionError("Multiple incompatible setting of column " + key);
            }
            operations.add(Pair.create(key, update));
        }



    // $ANTLR start "query"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:200:1: query returns [ParsedStatement stmnt] : st= cqlStatement ( ';' )* EOF ;
    public final ParsedStatement query() throws RecognitionException {
        ParsedStatement stmnt = null;

        ParsedStatement st = null;


        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:203:5: (st= cqlStatement ( ';' )* EOF )
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:203:7: st= cqlStatement ( ';' )* EOF
            {
            pushFollow(FOLLOW_cqlStatement_in_query72);
            st=cqlStatement();

            state._fsp--;

            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:203:23: ( ';' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==136) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:203:24: ';'
            	    {
            	    match(input,136,FOLLOW_136_in_query75); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match(input,EOF,FOLLOW_EOF_in_query79); 
             stmnt = st; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmnt;
    }
    // $ANTLR end "query"


    // $ANTLR start "cqlStatement"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:206:1: cqlStatement returns [ParsedStatement stmt] : (st1= selectStatement | st2= insertStatement | st3= updateStatement | st4= batchStatement | st5= deleteStatement | st6= useStatement | st7= truncateStatement | st8= createKeyspaceStatement | st9= createTableStatement | st10= createIndexStatement | st11= dropKeyspaceStatement | st12= dropTableStatement | st13= dropIndexStatement | st14= alterTableStatement | st15= alterKeyspaceStatement | st16= grantStatement | st17= revokeStatement | st18= listPermissionsStatement | st19= createUserStatement | st20= alterUserStatement | st21= dropUserStatement | st22= listUsersStatement | st23= createTriggerStatement | st24= dropTriggerStatement );
    public final ParsedStatement cqlStatement() throws RecognitionException {
        ParsedStatement stmt = null;

        SelectStatement.RawStatement st1 = null;

        UpdateStatement.ParsedInsert st2 = null;

        UpdateStatement.ParsedUpdate st3 = null;

        BatchStatement.Parsed st4 = null;

        DeleteStatement.Parsed st5 = null;

        UseStatement st6 = null;

        TruncateStatement st7 = null;

        CreateKeyspaceStatement st8 = null;

        CreateTableStatement.RawStatement st9 = null;

        CreateIndexStatement st10 = null;

        DropKeyspaceStatement st11 = null;

        DropTableStatement st12 = null;

        DropIndexStatement st13 = null;

        AlterTableStatement st14 = null;

        AlterKeyspaceStatement st15 = null;

        GrantStatement st16 = null;

        RevokeStatement st17 = null;

        ListPermissionsStatement st18 = null;

        CreateUserStatement st19 = null;

        AlterUserStatement st20 = null;

        DropUserStatement st21 = null;

        ListUsersStatement st22 = null;

        CreateTriggerStatement st23 = null;

        DropTriggerStatement st24 = null;


        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:208:5: (st1= selectStatement | st2= insertStatement | st3= updateStatement | st4= batchStatement | st5= deleteStatement | st6= useStatement | st7= truncateStatement | st8= createKeyspaceStatement | st9= createTableStatement | st10= createIndexStatement | st11= dropKeyspaceStatement | st12= dropTableStatement | st13= dropIndexStatement | st14= alterTableStatement | st15= alterKeyspaceStatement | st16= grantStatement | st17= revokeStatement | st18= listPermissionsStatement | st19= createUserStatement | st20= alterUserStatement | st21= dropUserStatement | st22= listUsersStatement | st23= createTriggerStatement | st24= dropTriggerStatement )
            int alt2=24;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:208:7: st1= selectStatement
                    {
                    pushFollow(FOLLOW_selectStatement_in_cqlStatement113);
                    st1=selectStatement();

                    state._fsp--;

                     stmt = st1; 

                    }
                    break;
                case 2 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:209:7: st2= insertStatement
                    {
                    pushFollow(FOLLOW_insertStatement_in_cqlStatement138);
                    st2=insertStatement();

                    state._fsp--;

                     stmt = st2; 

                    }
                    break;
                case 3 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:210:7: st3= updateStatement
                    {
                    pushFollow(FOLLOW_updateStatement_in_cqlStatement163);
                    st3=updateStatement();

                    state._fsp--;

                     stmt = st3; 

                    }
                    break;
                case 4 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:211:7: st4= batchStatement
                    {
                    pushFollow(FOLLOW_batchStatement_in_cqlStatement188);
                    st4=batchStatement();

                    state._fsp--;

                     stmt = st4; 

                    }
                    break;
                case 5 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:212:7: st5= deleteStatement
                    {
                    pushFollow(FOLLOW_deleteStatement_in_cqlStatement214);
                    st5=deleteStatement();

                    state._fsp--;

                     stmt = st5; 

                    }
                    break;
                case 6 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:213:7: st6= useStatement
                    {
                    pushFollow(FOLLOW_useStatement_in_cqlStatement239);
                    st6=useStatement();

                    state._fsp--;

                     stmt = st6; 

                    }
                    break;
                case 7 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:214:7: st7= truncateStatement
                    {
                    pushFollow(FOLLOW_truncateStatement_in_cqlStatement267);
                    st7=truncateStatement();

                    state._fsp--;

                     stmt = st7; 

                    }
                    break;
                case 8 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:215:7: st8= createKeyspaceStatement
                    {
                    pushFollow(FOLLOW_createKeyspaceStatement_in_cqlStatement290);
                    st8=createKeyspaceStatement();

                    state._fsp--;

                     stmt = st8; 

                    }
                    break;
                case 9 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:216:7: st9= createTableStatement
                    {
                    pushFollow(FOLLOW_createTableStatement_in_cqlStatement307);
                    st9=createTableStatement();

                    state._fsp--;

                     stmt = st9; 

                    }
                    break;
                case 10 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:217:7: st10= createIndexStatement
                    {
                    pushFollow(FOLLOW_createIndexStatement_in_cqlStatement326);
                    st10=createIndexStatement();

                    state._fsp--;

                     stmt = st10; 

                    }
                    break;
                case 11 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:218:7: st11= dropKeyspaceStatement
                    {
                    pushFollow(FOLLOW_dropKeyspaceStatement_in_cqlStatement345);
                    st11=dropKeyspaceStatement();

                    state._fsp--;

                     stmt = st11; 

                    }
                    break;
                case 12 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:219:7: st12= dropTableStatement
                    {
                    pushFollow(FOLLOW_dropTableStatement_in_cqlStatement363);
                    st12=dropTableStatement();

                    state._fsp--;

                     stmt = st12; 

                    }
                    break;
                case 13 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:220:7: st13= dropIndexStatement
                    {
                    pushFollow(FOLLOW_dropIndexStatement_in_cqlStatement384);
                    st13=dropIndexStatement();

                    state._fsp--;

                     stmt = st13; 

                    }
                    break;
                case 14 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:221:7: st14= alterTableStatement
                    {
                    pushFollow(FOLLOW_alterTableStatement_in_cqlStatement405);
                    st14=alterTableStatement();

                    state._fsp--;

                     stmt = st14; 

                    }
                    break;
                case 15 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:222:7: st15= alterKeyspaceStatement
                    {
                    pushFollow(FOLLOW_alterKeyspaceStatement_in_cqlStatement425);
                    st15=alterKeyspaceStatement();

                    state._fsp--;

                     stmt = st15; 

                    }
                    break;
                case 16 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:223:7: st16= grantStatement
                    {
                    pushFollow(FOLLOW_grantStatement_in_cqlStatement442);
                    st16=grantStatement();

                    state._fsp--;

                     stmt = st16; 

                    }
                    break;
                case 17 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:224:7: st17= revokeStatement
                    {
                    pushFollow(FOLLOW_revokeStatement_in_cqlStatement467);
                    st17=revokeStatement();

                    state._fsp--;

                     stmt = st17; 

                    }
                    break;
                case 18 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:225:7: st18= listPermissionsStatement
                    {
                    pushFollow(FOLLOW_listPermissionsStatement_in_cqlStatement491);
                    st18=listPermissionsStatement();

                    state._fsp--;

                     stmt = st18; 

                    }
                    break;
                case 19 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:226:7: st19= createUserStatement
                    {
                    pushFollow(FOLLOW_createUserStatement_in_cqlStatement506);
                    st19=createUserStatement();

                    state._fsp--;

                     stmt = st19; 

                    }
                    break;
                case 20 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:227:7: st20= alterUserStatement
                    {
                    pushFollow(FOLLOW_alterUserStatement_in_cqlStatement526);
                    st20=alterUserStatement();

                    state._fsp--;

                     stmt = st20; 

                    }
                    break;
                case 21 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:228:7: st21= dropUserStatement
                    {
                    pushFollow(FOLLOW_dropUserStatement_in_cqlStatement547);
                    st21=dropUserStatement();

                    state._fsp--;

                     stmt = st21; 

                    }
                    break;
                case 22 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:229:7: st22= listUsersStatement
                    {
                    pushFollow(FOLLOW_listUsersStatement_in_cqlStatement569);
                    st22=listUsersStatement();

                    state._fsp--;

                     stmt = st22; 

                    }
                    break;
                case 23 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:230:7: st23= createTriggerStatement
                    {
                    pushFollow(FOLLOW_createTriggerStatement_in_cqlStatement590);
                    st23=createTriggerStatement();

                    state._fsp--;

                     stmt = st23; 

                    }
                    break;
                case 24 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:231:7: st24= dropTriggerStatement
                    {
                    pushFollow(FOLLOW_dropTriggerStatement_in_cqlStatement607);
                    st24=dropTriggerStatement();

                    state._fsp--;

                     stmt = st24; 

                    }
                    break;

            }
             if (stmt != null) stmt.setBoundVariables(bindVariables); 
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "cqlStatement"


    // $ANTLR start "useStatement"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:237:1: useStatement returns [UseStatement stmt] : K_USE ks= keyspaceName ;
    public final UseStatement useStatement() throws RecognitionException {
        UseStatement stmt = null;

        String ks = null;


        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:238:5: ( K_USE ks= keyspaceName )
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:238:7: K_USE ks= keyspaceName
            {
            match(input,K_USE,FOLLOW_K_USE_in_useStatement639); 
            pushFollow(FOLLOW_keyspaceName_in_useStatement643);
            ks=keyspaceName();

            state._fsp--;

             stmt = new UseStatement(ks); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "useStatement"


    // $ANTLR start "selectStatement"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:241:1: selectStatement returns [SelectStatement.RawStatement expr] : K_SELECT ( ( K_DISTINCT )? sclause= selectClause | ( K_COUNT '(' sclause= selectCountClause ')' ( K_AS c= ident )? ) ) K_FROM cf= columnFamilyName ( K_WHERE wclause= whereClause )? ( K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )* )? ( K_LIMIT rows= intValue )? ( K_ALLOW K_FILTERING )? ;
    public final SelectStatement.RawStatement selectStatement() throws RecognitionException {
        SelectStatement.RawStatement expr = null;

        List<RawSelector> sclause = null;

        ColumnIdentifier c = null;

        CFName cf = null;

        List<Relation> wclause = null;

        Term.Raw rows = null;



                boolean isDistinct = false;
                boolean isCount = false;
                ColumnIdentifier countAlias = null;
                Term.Raw limit = null;
                Map<ColumnIdentifier.Raw, Boolean> orderings = new LinkedHashMap<ColumnIdentifier.Raw, Boolean>();
                boolean allowFiltering = false;
            
        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:256:5: ( K_SELECT ( ( K_DISTINCT )? sclause= selectClause | ( K_COUNT '(' sclause= selectCountClause ')' ( K_AS c= ident )? ) ) K_FROM cf= columnFamilyName ( K_WHERE wclause= whereClause )? ( K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )* )? ( K_LIMIT rows= intValue )? ( K_ALLOW K_FILTERING )? )
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:256:7: K_SELECT ( ( K_DISTINCT )? sclause= selectClause | ( K_COUNT '(' sclause= selectCountClause ')' ( K_AS c= ident )? ) ) K_FROM cf= columnFamilyName ( K_WHERE wclause= whereClause )? ( K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )* )? ( K_LIMIT rows= intValue )? ( K_ALLOW K_FILTERING )?
            {
            match(input,K_SELECT,FOLLOW_K_SELECT_in_selectStatement677); 
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:256:16: ( ( K_DISTINCT )? sclause= selectClause | ( K_COUNT '(' sclause= selectCountClause ')' ( K_AS c= ident )? ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==K_DISTINCT||LA5_0==K_AS||(LA5_0>=K_FILTERING && LA5_0<=K_TTL)||LA5_0==K_VALUES||LA5_0==K_EXISTS||LA5_0==K_TIMESTAMP||LA5_0==K_COUNTER||LA5_0==K_STATIC||(LA5_0>=K_KEY && LA5_0<=K_CUSTOM)||LA5_0==IDENT||LA5_0==K_TRIGGER||LA5_0==K_TYPE||LA5_0==K_LIST||(LA5_0>=K_ALL && LA5_0<=QUOTED_NAME)||LA5_0==K_TOKEN||(LA5_0>=K_ASCII && LA5_0<=K_MAP)||LA5_0==140) ) {
                alt5=1;
            }
            else if ( (LA5_0==K_COUNT) ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==137) ) {
                    alt5=2;
                }
                else if ( ((LA5_2>=K_AS && LA5_2<=K_FROM)||LA5_2==139) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:256:18: ( K_DISTINCT )? sclause= selectClause
                    {
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:256:18: ( K_DISTINCT )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==K_DISTINCT) ) {
                        int LA3_1 = input.LA(2);

                        if ( (LA3_1==K_AS) ) {
                            int LA3_3 = input.LA(3);

                            if ( (LA3_3==K_FROM||LA3_3==137||LA3_3==139) ) {
                                alt3=1;
                            }
                            else if ( (LA3_3==K_AS) ) {
                                int LA3_5 = input.LA(4);

                                if ( ((LA3_5>=K_DISTINCT && LA3_5<=K_AS)||(LA3_5>=K_FILTERING && LA3_5<=K_TTL)||LA3_5==K_VALUES||LA3_5==K_EXISTS||LA3_5==K_TIMESTAMP||LA3_5==K_COUNTER||LA3_5==K_STATIC||(LA3_5>=K_KEY && LA3_5<=K_CUSTOM)||LA3_5==IDENT||LA3_5==K_TRIGGER||LA3_5==K_TYPE||LA3_5==K_LIST||(LA3_5>=K_ALL && LA3_5<=QUOTED_NAME)||(LA3_5>=K_ASCII && LA3_5<=K_MAP)) ) {
                                    alt3=1;
                                }
                            }
                        }
                        else if ( ((LA3_1>=K_DISTINCT && LA3_1<=K_COUNT)||(LA3_1>=K_FILTERING && LA3_1<=K_TTL)||LA3_1==K_VALUES||LA3_1==K_EXISTS||LA3_1==K_TIMESTAMP||LA3_1==K_COUNTER||LA3_1==K_STATIC||(LA3_1>=K_KEY && LA3_1<=K_CUSTOM)||LA3_1==IDENT||LA3_1==K_TRIGGER||LA3_1==K_TYPE||LA3_1==K_LIST||(LA3_1>=K_ALL && LA3_1<=QUOTED_NAME)||LA3_1==K_TOKEN||(LA3_1>=K_ASCII && LA3_1<=K_MAP)||LA3_1==140) ) {
                            alt3=1;
                        }
                    }
                    switch (alt3) {
                        case 1 :
                            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:256:20: K_DISTINCT
                            {
                            match(input,K_DISTINCT,FOLLOW_K_DISTINCT_in_selectStatement683); 
                             isDistinct = true; 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_selectClause_in_selectStatement692);
                    sclause=selectClause();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:257:18: ( K_COUNT '(' sclause= selectCountClause ')' ( K_AS c= ident )? )
                    {
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:257:18: ( K_COUNT '(' sclause= selectCountClause ')' ( K_AS c= ident )? )
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:257:19: K_COUNT '(' sclause= selectCountClause ')' ( K_AS c= ident )?
                    {
                    match(input,K_COUNT,FOLLOW_K_COUNT_in_selectStatement712); 
                    match(input,137,FOLLOW_137_in_selectStatement714); 
                    pushFollow(FOLLOW_selectCountClause_in_selectStatement718);
                    sclause=selectCountClause();

                    state._fsp--;

                    match(input,138,FOLLOW_138_in_selectStatement720); 
                     isCount = true; 
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:257:81: ( K_AS c= ident )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==K_AS) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:257:82: K_AS c= ident
                            {
                            match(input,K_AS,FOLLOW_K_AS_in_selectStatement725); 
                            pushFollow(FOLLOW_ident_in_selectStatement729);
                            c=ident();

                            state._fsp--;

                             countAlias = c; 

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            match(input,K_FROM,FOLLOW_K_FROM_in_selectStatement744); 
            pushFollow(FOLLOW_columnFamilyName_in_selectStatement748);
            cf=columnFamilyName();

            state._fsp--;

            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:259:7: ( K_WHERE wclause= whereClause )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==K_WHERE) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:259:9: K_WHERE wclause= whereClause
                    {
                    match(input,K_WHERE,FOLLOW_K_WHERE_in_selectStatement758); 
                    pushFollow(FOLLOW_whereClause_in_selectStatement762);
                    wclause=whereClause();

                    state._fsp--;


                    }
                    break;

            }

            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:260:7: ( K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==K_ORDER) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:260:9: K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )*
                    {
                    match(input,K_ORDER,FOLLOW_K_ORDER_in_selectStatement775); 
                    match(input,K_BY,FOLLOW_K_BY_in_selectStatement777); 
                    pushFollow(FOLLOW_orderByClause_in_selectStatement779);
                    orderByClause(orderings);

                    state._fsp--;

                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:260:47: ( ',' orderByClause[orderings] )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==139) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:260:49: ',' orderByClause[orderings]
                    	    {
                    	    match(input,139,FOLLOW_139_in_selectStatement784); 
                    	    pushFollow(FOLLOW_orderByClause_in_selectStatement786);
                    	    orderByClause(orderings);

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:261:7: ( K_LIMIT rows= intValue )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==K_LIMIT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:261:9: K_LIMIT rows= intValue
                    {
                    match(input,K_LIMIT,FOLLOW_K_LIMIT_in_selectStatement803); 
                    pushFollow(FOLLOW_intValue_in_selectStatement807);
                    rows=intValue();

                    state._fsp--;

                     limit = rows; 

                    }
                    break;

            }

            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:262:7: ( K_ALLOW K_FILTERING )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==K_ALLOW) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:262:9: K_ALLOW K_FILTERING
                    {
                    match(input,K_ALLOW,FOLLOW_K_ALLOW_in_selectStatement822); 
                    match(input,K_FILTERING,FOLLOW_K_FILTERING_in_selectStatement824); 
                     allowFiltering = true; 

                    }
                    break;

            }


                      SelectStatement.Parameters params = new SelectStatement.Parameters(orderings,
                                                                                         isDistinct,
                                                                                         isCount,
                                                                                         countAlias,
                                                                                         allowFiltering);
                      expr = new SelectStatement.RawStatement(cf, params, sclause, wclause, limit);
                  

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "selectStatement"


    // $ANTLR start "selectClause"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:273:1: selectClause returns [List<RawSelector> expr] : (t1= selector ( ',' tN= selector )* | '\\*' );
    public final List<RawSelector> selectClause() throws RecognitionException {
        List<RawSelector> expr = null;

        RawSelector t1 = null;

        RawSelector tN = null;


        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:274:5: (t1= selector ( ',' tN= selector )* | '\\*' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=K_DISTINCT && LA12_0<=K_AS)||(LA12_0>=K_FILTERING && LA12_0<=K_TTL)||LA12_0==K_VALUES||LA12_0==K_EXISTS||LA12_0==K_TIMESTAMP||LA12_0==K_COUNTER||LA12_0==K_STATIC||(LA12_0>=K_KEY && LA12_0<=K_CUSTOM)||LA12_0==IDENT||LA12_0==K_TRIGGER||LA12_0==K_TYPE||LA12_0==K_LIST||(LA12_0>=K_ALL && LA12_0<=QUOTED_NAME)||LA12_0==K_TOKEN||(LA12_0>=K_ASCII && LA12_0<=K_MAP)) ) {
                alt12=1;
            }
            else if ( (LA12_0==140) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:274:7: t1= selector ( ',' tN= selector )*
                    {
                    pushFollow(FOLLOW_selector_in_selectClause861);
                    t1=selector();

                    state._fsp--;

                     expr = new ArrayList<RawSelector>(); expr.add(t1); 
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:274:76: ( ',' tN= selector )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==139) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:274:77: ',' tN= selector
                    	    {
                    	    match(input,139,FOLLOW_139_in_selectClause866); 
                    	    pushFollow(FOLLOW_selector_in_selectClause870);
                    	    tN=selector();

                    	    state._fsp--;

                    	     expr.add(tN); 

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:275:7: '\\*'
                    {
                    match(input,140,FOLLOW_140_in_selectClause882); 
                     expr = Collections.<RawSelector>emptyList();

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "selectClause"


    // $ANTLR start "selector"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:278:1: selector returns [RawSelector s] : us= unaliasedSelector ( K_AS c= ident )? ;
    public final RawSelector selector() throws RecognitionException {
        RawSelector s = null;

        Selectable.Raw us = null;

        ColumnIdentifier c = null;


         ColumnIdentifier alias = null; 
        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:280:5: (us= unaliasedSelector ( K_AS c= ident )? )
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:280:7: us= unaliasedSelector ( K_AS c= ident )?
            {
            pushFollow(FOLLOW_unaliasedSelector_in_selector915);
            us=unaliasedSelector();

            state._fsp--;

            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:280:28: ( K_AS c= ident )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==K_AS) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:280:29: K_AS c= ident
                    {
                    match(input,K_AS,FOLLOW_K_AS_in_selector918); 
                    pushFollow(FOLLOW_ident_in_selector922);
                    c=ident();

                    state._fsp--;

                     alias = c; 

                    }
                    break;

            }

             s = new RawSelector(us, alias); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return s;
    }
    // $ANTLR end "selector"


    // $ANTLR start "unaliasedSelector"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:283:1: unaliasedSelector returns [Selectable.Raw s] : (c= cident | K_WRITETIME '(' c= cident ')' | K_TTL '(' c= cident ')' | f= functionName args= selectionFunctionArgs );
    public final Selectable.Raw unaliasedSelector() throws RecognitionException {
        Selectable.Raw s = null;

        ColumnIdentifier.Raw c = null;

        String f = null;

        List<Selectable.Raw> args = null;


        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:284:5: (c= cident | K_WRITETIME '(' c= cident ')' | K_TTL '(' c= cident ')' | f= functionName args= selectionFunctionArgs )
            int alt14=4;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:284:7: c= cident
                    {
                    pushFollow(FOLLOW_cident_in_unaliasedSelector951);
                    c=cident();

                    state._fsp--;

                     s = c; 

                    }
                    break;
                case 2 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:285:7: K_WRITETIME '(' c= cident ')'
                    {
                    match(input,K_WRITETIME,FOLLOW_K_WRITETIME_in_unaliasedSelector994); 
                    match(input,137,FOLLOW_137_in_unaliasedSelector996); 
                    pushFollow(FOLLOW_cident_in_unaliasedSelector1000);
                    c=cident();

                    state._fsp--;

                    match(input,138,FOLLOW_138_in_unaliasedSelector1002); 
                     s = new Selectable.WritetimeOrTTL.Raw(c, true); 

                    }
                    break;
                case 3 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:286:7: K_TTL '(' c= cident ')'
                    {
                    match(input,K_TTL,FOLLOW_K_TTL_in_unaliasedSelector1025); 
                    match(input,137,FOLLOW_137_in_unaliasedSelector1033); 
                    pushFollow(FOLLOW_cident_in_unaliasedSelector1037);
                    c=cident();

                    state._fsp--;

                    match(input,138,FOLLOW_138_in_unaliasedSelector1039); 
                     s = new Selectable.WritetimeOrTTL.Raw(c, false); 

                    }
                    break;
                case 4 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:287:7: f= functionName args= selectionFunctionArgs
                    {
                    pushFollow(FOLLOW_functionName_in_unaliasedSelector1064);
                    f=functionName();

                    state._fsp--;

                    pushFollow(FOLLOW_selectionFunctionArgs_in_unaliasedSelector1068);
                    args=selectionFunctionArgs();

                    state._fsp--;

                     s = new Selectable.WithFunction.Raw(f, args); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return s;
    }
    // $ANTLR end "unaliasedSelector"


    // $ANTLR start "selectionFunctionArgs"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:290:1: selectionFunctionArgs returns [List<Selectable.Raw> a] : ( '(' ')' | '(' s1= unaliasedSelector ( ',' sn= unaliasedSelector )* ')' );
    public final List<Selectable.Raw> selectionFunctionArgs() throws RecognitionException {
        List<Selectable.Raw> a = null;

        Selectable.Raw s1 = null;

        Selectable.Raw sn = null;


        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:291:5: ( '(' ')' | '(' s1= unaliasedSelector ( ',' sn= unaliasedSelector )* ')' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==137) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==138) ) {
                    alt16=1;
                }
                else if ( ((LA16_1>=K_DISTINCT && LA16_1<=K_AS)||(LA16_1>=K_FILTERING && LA16_1<=K_TTL)||LA16_1==K_VALUES||LA16_1==K_EXISTS||LA16_1==K_TIMESTAMP||LA16_1==K_COUNTER||LA16_1==K_STATIC||(LA16_1>=K_KEY && LA16_1<=K_CUSTOM)||LA16_1==IDENT||LA16_1==K_TRIGGER||LA16_1==K_TYPE||LA16_1==K_LIST||(LA16_1>=K_ALL && LA16_1<=QUOTED_NAME)||LA16_1==K_TOKEN||(LA16_1>=K_ASCII && LA16_1<=K_MAP)) ) {
                    alt16=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:291:7: '(' ')'
                    {
                    match(input,137,FOLLOW_137_in_selectionFunctionArgs1091); 
                    match(input,138,FOLLOW_138_in_selectionFunctionArgs1093); 
                     a = Collections.emptyList(); 

                    }
                    break;
                case 2 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:292:7: '(' s1= unaliasedSelector ( ',' sn= unaliasedSelector )* ')'
                    {
                    match(input,137,FOLLOW_137_in_selectionFunctionArgs1103); 
                    pushFollow(FOLLOW_unaliasedSelector_in_selectionFunctionArgs1107);
                    s1=unaliasedSelector();

                    state._fsp--;

                     List<Selectable.Raw> args = new ArrayList<Selectable.Raw>(); args.add(s1); 
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:293:11: ( ',' sn= unaliasedSelector )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==139) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:293:13: ',' sn= unaliasedSelector
                    	    {
                    	    match(input,139,FOLLOW_139_in_selectionFunctionArgs1123); 
                    	    pushFollow(FOLLOW_unaliasedSelector_in_selectionFunctionArgs1127);
                    	    sn=unaliasedSelector();

                    	    state._fsp--;

                    	     args.add(sn); 

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    match(input,138,FOLLOW_138_in_selectionFunctionArgs1141); 
                     a = args; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return a;
    }
    // $ANTLR end "selectionFunctionArgs"


    // $ANTLR start "selectCountClause"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:297:1: selectCountClause returns [List<RawSelector> expr] : ( '\\*' | i= INTEGER );
    public final List<RawSelector> selectCountClause() throws RecognitionException {
        List<RawSelector> expr = null;

        Token i=null;

        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:298:5: ( '\\*' | i= INTEGER )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==140) ) {
                alt17=1;
            }
            else if ( (LA17_0==INTEGER) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:298:7: '\\*'
                    {
                    match(input,140,FOLLOW_140_in_selectCountClause1164); 
                     expr = Collections.<RawSelector>emptyList();

                    }
                    break;
                case 2 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:299:7: i= INTEGER
                    {
                    i=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_selectCountClause1186); 
                     if (!i.getText().equals("1")) addRecognitionError("Only COUNT(1) is supported, got COUNT(" + i.getText() + ")"); expr = Collections.<RawSelector>emptyList();

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "selectCountClause"


    // $ANTLR start "whereClause"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:302:1: whereClause returns [List<Relation> clause] : relation[$clause] ( K_AND relation[$clause] )* ;
    public final List<Relation> whereClause() throws RecognitionException {
        List<Relation> clause = null;

         clause = new ArrayList<Relation>(); 
        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:304:5: ( relation[$clause] ( K_AND relation[$clause] )* )
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:304:7: relation[$clause] ( K_AND relation[$clause] )*
            {
            pushFollow(FOLLOW_relation_in_whereClause1222);
            relation(clause);

            state._fsp--;

            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:304:25: ( K_AND relation[$clause] )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==K_AND) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:304:26: K_AND relation[$clause]
            	    {
            	    match(input,K_AND,FOLLOW_K_AND_in_whereClause1226); 
            	    pushFollow(FOLLOW_relation_in_whereClause1228);
            	    relation(clause);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return clause;
    }
    // $ANTLR end "whereClause"


    // $ANTLR start "orderByClause"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:307:1: orderByClause[Map<ColumnIdentifier.Raw, Boolean> orderings] : c= cident ( K_ASC | K_DESC )? ;
    public final void orderByClause(Map<ColumnIdentifier.Raw, Boolean> orderings) throws RecognitionException {
        ColumnIdentifier.Raw c = null;



                ColumnIdentifier.Raw orderBy = null;
                boolean reversed = false;
            
        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:312:5: (c= cident ( K_ASC | K_DESC )? )
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:312:7: c= cident ( K_ASC | K_DESC )?
            {
            pushFollow(FOLLOW_cident_in_orderByClause1259);
            c=cident();

            state._fsp--;

             orderBy = c; 
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:312:33: ( K_ASC | K_DESC )?
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==K_ASC) ) {
                alt19=1;
            }
            else if ( (LA19_0==K_DESC) ) {
                alt19=2;
            }
            switch (alt19) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:312:34: K_ASC
                    {
                    match(input,K_ASC,FOLLOW_K_ASC_in_orderByClause1264); 

                    }
                    break;
                case 2 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:312:42: K_DESC
                    {
                    match(input,K_DESC,FOLLOW_K_DESC_in_orderByClause1268); 
                     reversed = true; 

                    }
                    break;

            }

             orderings.put(c, reversed); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "orderByClause"


    // $ANTLR start "insertStatement"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:315:1: insertStatement returns [UpdateStatement.ParsedInsert expr] : K_INSERT K_INTO cf= columnFamilyName '(' c1= cident ( ',' cn= cident )* ')' K_VALUES '(' v1= term ( ',' vn= term )* ')' ( K_IF K_NOT K_EXISTS )? ( usingClause[attrs] )? ;
    public final UpdateStatement.ParsedInsert insertStatement() throws RecognitionException {
        UpdateStatement.ParsedInsert expr = null;

        CFName cf = null;

        ColumnIdentifier.Raw c1 = null;

        ColumnIdentifier.Raw cn = null;

        Term.Raw v1 = null;

        Term.Raw vn = null;



                Attributes.Raw attrs = new Attributes.Raw();
                List<ColumnIdentifier.Raw> columnNames  = new ArrayList<ColumnIdentifier.Raw>();
                List<Term.Raw> values = new ArrayList<Term.Raw>();
                boolean ifNotExists = false;
            
        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:328:5: ( K_INSERT K_INTO cf= columnFamilyName '(' c1= cident ( ',' cn= cident )* ')' K_VALUES '(' v1= term ( ',' vn= term )* ')' ( K_IF K_NOT K_EXISTS )? ( usingClause[attrs] )? )
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:328:7: K_INSERT K_INTO cf= columnFamilyName '(' c1= cident ( ',' cn= cident )* ')' K_VALUES '(' v1= term ( ',' vn= term )* ')' ( K_IF K_NOT K_EXISTS )? ( usingClause[attrs] )?
            {
            match(input,K_INSERT,FOLLOW_K_INSERT_in_insertStatement1306); 
            match(input,K_INTO,FOLLOW_K_INTO_in_insertStatement1308); 
            pushFollow(FOLLOW_columnFamilyName_in_insertStatement1312);
            cf=columnFamilyName();

            state._fsp--;

            match(input,137,FOLLOW_137_in_insertStatement1324); 
            pushFollow(FOLLOW_cident_in_insertStatement1328);
            c1=cident();

            state._fsp--;

             columnNames.add(c1); 
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:329:51: ( ',' cn= cident )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==139) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:329:53: ',' cn= cident
            	    {
            	    match(input,139,FOLLOW_139_in_insertStatement1335); 
            	    pushFollow(FOLLOW_cident_in_insertStatement1339);
            	    cn=cident();

            	    state._fsp--;

            	     columnNames.add(cn); 

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            match(input,138,FOLLOW_138_in_insertStatement1346); 
            match(input,K_VALUES,FOLLOW_K_VALUES_in_insertStatement1356); 
            match(input,137,FOLLOW_137_in_insertStatement1368); 
            pushFollow(FOLLOW_term_in_insertStatement1372);
            v1=term();

            state._fsp--;

             values.add(v1); 
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:331:43: ( ',' vn= term )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==139) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:331:45: ',' vn= term
            	    {
            	    match(input,139,FOLLOW_139_in_insertStatement1378); 
            	    pushFollow(FOLLOW_term_in_insertStatement1382);
            	    vn=term();

            	    state._fsp--;

            	     values.add(vn); 

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            match(input,138,FOLLOW_138_in_insertStatement1389); 
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:333:9: ( K_IF K_NOT K_EXISTS )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==K_IF) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:333:11: K_IF K_NOT K_EXISTS
                    {
                    match(input,K_IF,FOLLOW_K_IF_in_insertStatement1402); 
                    match(input,K_NOT,FOLLOW_K_NOT_in_insertStatement1404); 
                    match(input,K_EXISTS,FOLLOW_K_EXISTS_in_insertStatement1406); 
                     ifNotExists = true; 

                    }
                    break;

            }

            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:334:9: ( usingClause[attrs] )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==K_USING) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:334:11: usingClause[attrs]
                    {
                    pushFollow(FOLLOW_usingClause_in_insertStatement1423);
                    usingClause(attrs);

                    state._fsp--;


                    }
                    break;

            }


                      expr = new UpdateStatement.ParsedInsert(cf,
                                                               attrs,
                                                               columnNames,
                                                               values,
                                                               ifNotExists);
                  

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "insertStatement"


    // $ANTLR start "usingClause"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:344:1: usingClause[Attributes.Raw attrs] : K_USING usingClauseObjective[attrs] ( K_AND usingClauseObjective[attrs] )* ;
    public final void usingClause(Attributes.Raw attrs) throws RecognitionException {
        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:345:5: ( K_USING usingClauseObjective[attrs] ( K_AND usingClauseObjective[attrs] )* )
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:345:7: K_USING usingClauseObjective[attrs] ( K_AND usingClauseObjective[attrs] )*
            {
            match(input,K_USING,FOLLOW_K_USING_in_usingClause1453); 
            pushFollow(FOLLOW_usingClauseObjective_in_usingClause1455);
            usingClauseObjective(attrs);

            state._fsp--;

            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:345:43: ( K_AND usingClauseObjective[attrs] )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==K_AND) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:345:45: K_AND usingClauseObjective[attrs]
            	    {
            	    match(input,K_AND,FOLLOW_K_AND_in_usingClause1460); 
            	    pushFollow(FOLLOW_usingClauseObjective_in_usingClause1462);
            	    usingClauseObjective(attrs);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "usingClause"


    // $ANTLR start "usingClauseObjective"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:348:1: usingClauseObjective[Attributes.Raw attrs] : ( K_TIMESTAMP ts= intValue | K_TTL t= intValue );
    public final void usingClauseObjective(Attributes.Raw attrs) throws RecognitionException {
        Term.Raw ts = null;

        Term.Raw t = null;


        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:349:5: ( K_TIMESTAMP ts= intValue | K_TTL t= intValue )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==K_TIMESTAMP) ) {
                alt25=1;
            }
            else if ( (LA25_0==K_TTL) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:349:7: K_TIMESTAMP ts= intValue
                    {
                    match(input,K_TIMESTAMP,FOLLOW_K_TIMESTAMP_in_usingClauseObjective1484); 
                    pushFollow(FOLLOW_intValue_in_usingClauseObjective1488);
                    ts=intValue();

                    state._fsp--;

                     attrs.timestamp = ts; 

                    }
                    break;
                case 2 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:350:7: K_TTL t= intValue
                    {
                    match(input,K_TTL,FOLLOW_K_TTL_in_usingClauseObjective1498); 
                    pushFollow(FOLLOW_intValue_in_usingClauseObjective1502);
                    t=intValue();

                    state._fsp--;

                     attrs.timeToLive = t; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "usingClauseObjective"


    // $ANTLR start "updateStatement"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:353:1: updateStatement returns [UpdateStatement.ParsedUpdate expr] : K_UPDATE cf= columnFamilyName ( usingClause[attrs] )? K_SET columnOperation[operations] ( ',' columnOperation[operations] )* K_WHERE wclause= whereClause ( K_IF conditions= updateConditions )? ;
    public final UpdateStatement.ParsedUpdate updateStatement() throws RecognitionException {
        UpdateStatement.ParsedUpdate expr = null;

        CFName cf = null;

        List<Relation> wclause = null;

        List<Pair<ColumnIdentifier.Raw, ColumnCondition.Raw>> conditions = null;



                Attributes.Raw attrs = new Attributes.Raw();
                List<Pair<ColumnIdentifier.Raw, Operation.RawUpdate>> operations = new ArrayList<Pair<ColumnIdentifier.Raw, Operation.RawUpdate>>();
            
        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:364:5: ( K_UPDATE cf= columnFamilyName ( usingClause[attrs] )? K_SET columnOperation[operations] ( ',' columnOperation[operations] )* K_WHERE wclause= whereClause ( K_IF conditions= updateConditions )? )
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:364:7: K_UPDATE cf= columnFamilyName ( usingClause[attrs] )? K_SET columnOperation[operations] ( ',' columnOperation[operations] )* K_WHERE wclause= whereClause ( K_IF conditions= updateConditions )?
            {
            match(input,K_UPDATE,FOLLOW_K_UPDATE_in_updateStatement1536); 
            pushFollow(FOLLOW_columnFamilyName_in_updateStatement1540);
            cf=columnFamilyName();

            state._fsp--;

            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:365:7: ( usingClause[attrs] )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==K_USING) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:365:9: usingClause[attrs]
                    {
                    pushFollow(FOLLOW_usingClause_in_updateStatement1550);
                    usingClause(attrs);

                    state._fsp--;


                    }
                    break;

            }

            match(input,K_SET,FOLLOW_K_SET_in_updateStatement1562); 
            pushFollow(FOLLOW_columnOperation_in_updateStatement1564);
            columnOperation(operations);

            state._fsp--;

            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:366:41: ( ',' columnOperation[operations] )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==139) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:366:42: ',' columnOperation[operations]
            	    {
            	    match(input,139,FOLLOW_139_in_updateStatement1568); 
            	    pushFollow(FOLLOW_columnOperation_in_updateStatement1570);
            	    columnOperation(operations);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            match(input,K_WHERE,FOLLOW_K_WHERE_in_updateStatement1581); 
            pushFollow(FOLLOW_whereClause_in_updateStatement1585);
            wclause=whereClause();

            state._fsp--;

            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:368:7: ( K_IF conditions= updateConditions )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==K_IF) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:368:9: K_IF conditions= updateConditions
                    {
                    match(input,K_IF,FOLLOW_K_IF_in_updateStatement1595); 
                    pushFollow(FOLLOW_updateConditions_in_updateStatement1599);
                    conditions=updateConditions();

                    state._fsp--;


                    }
                    break;

            }


                      return new UpdateStatement.ParsedUpdate(cf,
                                                              attrs,
                                                              operations,
                                                              wclause,
                                                              conditions == null ? Collections.<Pair<ColumnIdentifier.Raw, ColumnCondition.Raw>>emptyList() : conditions);
                 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "updateStatement"


    // $ANTLR start "updateConditions"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:378:1: updateConditions returns [List<Pair<ColumnIdentifier.Raw, ColumnCondition.Raw>> conditions] : columnCondition[conditions] ( K_AND columnCondition[conditions] )* ;
    public final List<Pair<ColumnIdentifier.Raw, ColumnCondition.Raw>> updateConditions() throws RecognitionException {
        List<Pair<ColumnIdentifier.Raw, ColumnCondition.Raw>> conditions = null;

         conditions = new ArrayList<Pair<ColumnIdentifier.Raw, ColumnCondition.Raw>>(); 
        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:380:5: ( columnCondition[conditions] ( K_AND columnCondition[conditions] )* )
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:380:7: columnCondition[conditions] ( K_AND columnCondition[conditions] )*
            {
            pushFollow(FOLLOW_columnCondition_in_updateConditions1640);
            columnCondition(conditions);

            state._fsp--;

            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:380:35: ( K_AND columnCondition[conditions] )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==K_AND) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:380:37: K_AND columnCondition[conditions]
            	    {
            	    match(input,K_AND,FOLLOW_K_AND_in_updateConditions1645); 
            	    pushFollow(FOLLOW_columnCondition_in_updateConditions1647);
            	    columnCondition(conditions);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return conditions;
    }
    // $ANTLR end "updateConditions"


    // $ANTLR start "deleteStatement"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:384:1: deleteStatement returns [DeleteStatement.Parsed expr] : K_DELETE (dels= deleteSelection )? K_FROM cf= columnFamilyName ( usingClauseDelete[attrs] )? K_WHERE wclause= whereClause ( K_IF ( K_EXISTS | conditions= updateConditions ) )? ;
    public final DeleteStatement.Parsed deleteStatement() throws RecognitionException {
        DeleteStatement.Parsed expr = null;

        List<Operation.RawDeletion> dels = null;

        CFName cf = null;

        List<Relation> wclause = null;

        List<Pair<ColumnIdentifier.Raw, ColumnCondition.Raw>> conditions = null;



                Attributes.Raw attrs = new Attributes.Raw();
                List<Operation.RawDeletion> columnDeletions = Collections.emptyList();
                boolean ifExists = false;
            
        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:397:5: ( K_DELETE (dels= deleteSelection )? K_FROM cf= columnFamilyName ( usingClauseDelete[attrs] )? K_WHERE wclause= whereClause ( K_IF ( K_EXISTS | conditions= updateConditions ) )? )
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:397:7: K_DELETE (dels= deleteSelection )? K_FROM cf= columnFamilyName ( usingClauseDelete[attrs] )? K_WHERE wclause= whereClause ( K_IF ( K_EXISTS | conditions= updateConditions ) )?
            {
            match(input,K_DELETE,FOLLOW_K_DELETE_in_deleteStatement1684); 
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:397:16: (dels= deleteSelection )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=K_DISTINCT && LA30_0<=K_AS)||(LA30_0>=K_FILTERING && LA30_0<=K_TTL)||LA30_0==K_VALUES||LA30_0==K_EXISTS||LA30_0==K_TIMESTAMP||LA30_0==K_COUNTER||LA30_0==K_STATIC||(LA30_0>=K_KEY && LA30_0<=K_CUSTOM)||LA30_0==IDENT||LA30_0==K_TRIGGER||LA30_0==K_TYPE||LA30_0==K_LIST||(LA30_0>=K_ALL && LA30_0<=QUOTED_NAME)||(LA30_0>=K_ASCII && LA30_0<=K_MAP)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:397:18: dels= deleteSelection
                    {
                    pushFollow(FOLLOW_deleteSelection_in_deleteStatement1690);
                    dels=deleteSelection();

                    state._fsp--;

                     columnDeletions = dels; 

                    }
                    break;

            }

            match(input,K_FROM,FOLLOW_K_FROM_in_deleteStatement1703); 
            pushFollow(FOLLOW_columnFamilyName_in_deleteStatement1707);
            cf=columnFamilyName();

            state._fsp--;

            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:399:7: ( usingClauseDelete[attrs] )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==K_USING) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:399:9: usingClauseDelete[attrs]
                    {
                    pushFollow(FOLLOW_usingClauseDelete_in_deleteStatement1717);
                    usingClauseDelete(attrs);

                    state._fsp--;


                    }
                    break;

            }

            match(input,K_WHERE,FOLLOW_K_WHERE_in_deleteStatement1729); 
            pushFollow(FOLLOW_whereClause_in_deleteStatement1733);
            wclause=whereClause();

            state._fsp--;

            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:401:7: ( K_IF ( K_EXISTS | conditions= updateConditions ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==K_IF) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:401:9: K_IF ( K_EXISTS | conditions= updateConditions )
                    {
                    match(input,K_IF,FOLLOW_K_IF_in_deleteStatement1743); 
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:401:14: ( K_EXISTS | conditions= updateConditions )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==K_EXISTS) ) {
                        int LA32_1 = input.LA(2);

                        if ( (LA32_1==EOF||LA32_1==K_INSERT||LA32_1==K_UPDATE||LA32_1==K_DELETE||LA32_1==K_APPLY||LA32_1==136) ) {
                            alt32=1;
                        }
                        else if ( (LA32_1==141||LA32_1==148) ) {
                            alt32=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 32, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( ((LA32_0>=K_DISTINCT && LA32_0<=K_AS)||(LA32_0>=K_FILTERING && LA32_0<=K_TTL)||LA32_0==K_VALUES||LA32_0==K_TIMESTAMP||LA32_0==K_COUNTER||LA32_0==K_STATIC||(LA32_0>=K_KEY && LA32_0<=K_CUSTOM)||LA32_0==IDENT||LA32_0==K_TRIGGER||LA32_0==K_TYPE||LA32_0==K_LIST||(LA32_0>=K_ALL && LA32_0<=QUOTED_NAME)||(LA32_0>=K_ASCII && LA32_0<=K_MAP)) ) {
                        alt32=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;
                    }
                    switch (alt32) {
                        case 1 :
                            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:401:16: K_EXISTS
                            {
                            match(input,K_EXISTS,FOLLOW_K_EXISTS_in_deleteStatement1747); 
                             ifExists = true; 

                            }
                            break;
                        case 2 :
                            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:401:48: conditions= updateConditions
                            {
                            pushFollow(FOLLOW_updateConditions_in_deleteStatement1755);
                            conditions=updateConditions();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;

            }


                      return new DeleteStatement.Parsed(cf,
                                                        attrs,
                                                        columnDeletions,
                                                        wclause,
                                                        conditions == null ? Collections.<Pair<ColumnIdentifier.Raw, ColumnCondition.Raw>>emptyList() : conditions,
                                                        ifExists);
                  

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "deleteStatement"


    // $ANTLR start "deleteSelection"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:412:1: deleteSelection returns [List<Operation.RawDeletion> operations] : t1= deleteOp ( ',' tN= deleteOp )* ;
    public final List<Operation.RawDeletion> deleteSelection() throws RecognitionException {
        List<Operation.RawDeletion> operations = null;

        Operation.RawDeletion t1 = null;

        Operation.RawDeletion tN = null;


        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:413:5: (t1= deleteOp ( ',' tN= deleteOp )* )
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:413:7: t1= deleteOp ( ',' tN= deleteOp )*
            {
             operations = new ArrayList<Operation.RawDeletion>(); 
            pushFollow(FOLLOW_deleteOp_in_deleteSelection1802);
            t1=deleteOp();

            state._fsp--;

             operations.add(t1); 
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:415:11: ( ',' tN= deleteOp )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==139) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:415:12: ',' tN= deleteOp
            	    {
            	    match(input,139,FOLLOW_139_in_deleteSelection1817); 
            	    pushFollow(FOLLOW_deleteOp_in_deleteSelection1821);
            	    tN=deleteOp();

            	    state._fsp--;

            	     operations.add(tN); 

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return operations;
    }
    // $ANTLR end "deleteSelection"


    // $ANTLR start "deleteOp"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:418:1: deleteOp returns [Operation.RawDeletion op] : (c= cident | c= cident '[' t= term ']' );
    public final Operation.RawDeletion deleteOp() throws RecognitionException {
        Operation.RawDeletion op = null;

        ColumnIdentifier.Raw c = null;

        Term.Raw t = null;


        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:419:5: (c= cident | c= cident '[' t= term ']' )
            int alt35=2;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:419:7: c= cident
                    {
                    pushFollow(FOLLOW_cident_in_deleteOp1848);
                    c=cident();

                    state._fsp--;

                     op = new Operation.ColumnDeletion(c); 

                    }
                    break;
                case 2 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:420:7: c= cident '[' t= term ']'
                    {
                    pushFollow(FOLLOW_cident_in_deleteOp1875);
                    c=cident();

                    state._fsp--;

                    match(input,141,FOLLOW_141_in_deleteOp1877); 
                    pushFollow(FOLLOW_term_in_deleteOp1881);
                    t=term();

                    state._fsp--;

                    match(input,142,FOLLOW_142_in_deleteOp1883); 
                     op = new Operation.ElementDeletion(c, t); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return op;
    }
    // $ANTLR end "deleteOp"


    // $ANTLR start "usingClauseDelete"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:423:1: usingClauseDelete[Attributes.Raw attrs] : K_USING K_TIMESTAMP ts= intValue ;
    public final void usingClauseDelete(Attributes.Raw attrs) throws RecognitionException {
        Term.Raw ts = null;


        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:424:5: ( K_USING K_TIMESTAMP ts= intValue )
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:424:7: K_USING K_TIMESTAMP ts= intValue
            {
            match(input,K_USING,FOLLOW_K_USING_in_usingClauseDelete1903); 
            match(input,K_TIMESTAMP,FOLLOW_K_TIMESTAMP_in_usingClauseDelete1905); 
            pushFollow(FOLLOW_intValue_in_usingClauseDelete1909);
            ts=intValue();

            state._fsp--;

             attrs.timestamp = ts; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "usingClauseDelete"


    // $ANTLR start "batchStatement"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:427:1: batchStatement returns [BatchStatement.Parsed expr] : K_BEGIN ( K_UNLOGGED | K_COUNTER )? K_BATCH ( usingClause[attrs] )? (s= batchStatementObjective ( ';' )? )* K_APPLY K_BATCH ;
    public final BatchStatement.Parsed batchStatement() throws RecognitionException {
        BatchStatement.Parsed expr = null;

        ModificationStatement.Parsed s = null;



                BatchStatement.Type type = BatchStatement.Type.LOGGED;
                List<ModificationStatement.Parsed> statements = new ArrayList<ModificationStatement.Parsed>();
                Attributes.Raw attrs = new Attributes.Raw();
            
        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:457:5: ( K_BEGIN ( K_UNLOGGED | K_COUNTER )? K_BATCH ( usingClause[attrs] )? (s= batchStatementObjective ( ';' )? )* K_APPLY K_BATCH )
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:457:7: K_BEGIN ( K_UNLOGGED | K_COUNTER )? K_BATCH ( usingClause[attrs] )? (s= batchStatementObjective ( ';' )? )* K_APPLY K_BATCH
            {
            match(input,K_BEGIN,FOLLOW_K_BEGIN_in_batchStatement1943); 
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:458:7: ( K_UNLOGGED | K_COUNTER )?
            int alt36=3;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==K_UNLOGGED) ) {
                alt36=1;
            }
            else if ( (LA36_0==K_COUNTER) ) {
                alt36=2;
            }
            switch (alt36) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:458:9: K_UNLOGGED
                    {
                    match(input,K_UNLOGGED,FOLLOW_K_UNLOGGED_in_batchStatement1953); 
                     type = BatchStatement.Type.UNLOGGED; 

                    }
                    break;
                case 2 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:458:63: K_COUNTER
                    {
                    match(input,K_COUNTER,FOLLOW_K_COUNTER_in_batchStatement1959); 
                     type = BatchStatement.Type.COUNTER; 

                    }
                    break;

            }

            match(input,K_BATCH,FOLLOW_K_BATCH_in_batchStatement1972); 
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:459:15: ( usingClause[attrs] )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==K_USING) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:459:17: usingClause[attrs]
                    {
                    pushFollow(FOLLOW_usingClause_in_batchStatement1976);
                    usingClause(attrs);

                    state._fsp--;


                    }
                    break;

            }

            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:460:11: (s= batchStatementObjective ( ';' )? )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==K_INSERT||LA39_0==K_UPDATE||LA39_0==K_DELETE) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:460:13: s= batchStatementObjective ( ';' )?
            	    {
            	    pushFollow(FOLLOW_batchStatementObjective_in_batchStatement1996);
            	    s=batchStatementObjective();

            	    state._fsp--;

            	    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:460:39: ( ';' )?
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0==136) ) {
            	        alt38=1;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:460:39: ';'
            	            {
            	            match(input,136,FOLLOW_136_in_batchStatement1998); 

            	            }
            	            break;

            	    }

            	     statements.add(s); 

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            match(input,K_APPLY,FOLLOW_K_APPLY_in_batchStatement2012); 
            match(input,K_BATCH,FOLLOW_K_BATCH_in_batchStatement2014); 

                      return new BatchStatement.Parsed(type, attrs, statements);
                  

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "batchStatement"


    // $ANTLR start "batchStatementObjective"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:467:1: batchStatementObjective returns [ModificationStatement.Parsed statement] : (i= insertStatement | u= updateStatement | d= deleteStatement );
    public final ModificationStatement.Parsed batchStatementObjective() throws RecognitionException {
        ModificationStatement.Parsed statement = null;

        UpdateStatement.ParsedInsert i = null;

        UpdateStatement.ParsedUpdate u = null;

        DeleteStatement.Parsed d = null;


        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:468:5: (i= insertStatement | u= updateStatement | d= deleteStatement )
            int alt40=3;
            switch ( input.LA(1) ) {
            case K_INSERT:
                {
                alt40=1;
                }
                break;
            case K_UPDATE:
                {
                alt40=2;
                }
                break;
            case K_DELETE:
                {
                alt40=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:468:7: i= insertStatement
                    {
                    pushFollow(FOLLOW_insertStatement_in_batchStatementObjective2045);
                    i=insertStatement();

                    state._fsp--;

                     statement = i; 

                    }
                    break;
                case 2 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:469:7: u= updateStatement
                    {
                    pushFollow(FOLLOW_updateStatement_in_batchStatementObjective2058);
                    u=updateStatement();

                    state._fsp--;

                     statement = u; 

                    }
                    break;
                case 3 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:470:7: d= deleteStatement
                    {
                    pushFollow(FOLLOW_deleteStatement_in_batchStatementObjective2071);
                    d=deleteStatement();

                    state._fsp--;

                     statement = d; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return statement;
    }
    // $ANTLR end "batchStatementObjective"


    // $ANTLR start "createKeyspaceStatement"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:473:1: createKeyspaceStatement returns [CreateKeyspaceStatement expr] : K_CREATE K_KEYSPACE ( K_IF K_NOT K_EXISTS )? ks= keyspaceName K_WITH properties[attrs] ;
    public final CreateKeyspaceStatement createKeyspaceStatement() throws RecognitionException {
        CreateKeyspaceStatement expr = null;

        String ks = null;



                KSPropDefs attrs = new KSPropDefs();
                boolean ifNotExists = false;
            
        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:481:5: ( K_CREATE K_KEYSPACE ( K_IF K_NOT K_EXISTS )? ks= keyspaceName K_WITH properties[attrs] )
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:481:7: K_CREATE K_KEYSPACE ( K_IF K_NOT K_EXISTS )? ks= keyspaceName K_WITH properties[attrs]
            {
            match(input,K_CREATE,FOLLOW_K_CREATE_in_createKeyspaceStatement2106); 
            match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_createKeyspaceStatement2108); 
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:481:27: ( K_IF K_NOT K_EXISTS )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==K_IF) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:481:28: K_IF K_NOT K_EXISTS
                    {
                    match(input,K_IF,FOLLOW_K_IF_in_createKeyspaceStatement2111); 
                    match(input,K_NOT,FOLLOW_K_NOT_in_createKeyspaceStatement2113); 
                    match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createKeyspaceStatement2115); 
                     ifNotExists = true; 

                    }
                    break;

            }

            pushFollow(FOLLOW_keyspaceName_in_createKeyspaceStatement2124);
            ks=keyspaceName();

            state._fsp--;

            match(input,K_WITH,FOLLOW_K_WITH_in_createKeyspaceStatement2132); 
            pushFollow(FOLLOW_properties_in_createKeyspaceStatement2134);
            properties(attrs);

            state._fsp--;

             expr = new CreateKeyspaceStatement(ks, attrs, ifNotExists); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "createKeyspaceStatement"


    // $ANTLR start "createTableStatement"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:485:1: createTableStatement returns [CreateTableStatement.RawStatement expr] : K_CREATE K_COLUMNFAMILY ( K_IF K_NOT K_EXISTS )? cf= columnFamilyName cfamDefinition[expr] ;
    public final CreateTableStatement.RawStatement createTableStatement() throws RecognitionException {
        CreateTableStatement.RawStatement expr = null;

        CFName cf = null;


         boolean ifNotExists = false; 
        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:494:5: ( K_CREATE K_COLUMNFAMILY ( K_IF K_NOT K_EXISTS )? cf= columnFamilyName cfamDefinition[expr] )
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:494:7: K_CREATE K_COLUMNFAMILY ( K_IF K_NOT K_EXISTS )? cf= columnFamilyName cfamDefinition[expr]
            {
            match(input,K_CREATE,FOLLOW_K_CREATE_in_createTableStatement2169); 
            match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_createTableStatement2171); 
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:494:31: ( K_IF K_NOT K_EXISTS )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==K_IF) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:494:32: K_IF K_NOT K_EXISTS
                    {
                    match(input,K_IF,FOLLOW_K_IF_in_createTableStatement2174); 
                    match(input,K_NOT,FOLLOW_K_NOT_in_createTableStatement2176); 
                    match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createTableStatement2178); 
                     ifNotExists = true; 

                    }
                    break;

            }

            pushFollow(FOLLOW_columnFamilyName_in_createTableStatement2193);
            cf=columnFamilyName();

            state._fsp--;

             expr = new CreateTableStatement.RawStatement(cf, ifNotExists); 
            pushFollow(FOLLOW_cfamDefinition_in_createTableStatement2203);
            cfamDefinition(expr);

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "createTableStatement"


    // $ANTLR start "cfamDefinition"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:499:1: cfamDefinition[CreateTableStatement.RawStatement expr] : '(' cfamColumns[expr] ( ',' ( cfamColumns[expr] )? )* ')' ( K_WITH cfamProperty[expr] ( K_AND cfamProperty[expr] )* )? ;
    public final void cfamDefinition(CreateTableStatement.RawStatement expr) throws RecognitionException {
        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:500:5: ( '(' cfamColumns[expr] ( ',' ( cfamColumns[expr] )? )* ')' ( K_WITH cfamProperty[expr] ( K_AND cfamProperty[expr] )* )? )
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:500:7: '(' cfamColumns[expr] ( ',' ( cfamColumns[expr] )? )* ')' ( K_WITH cfamProperty[expr] ( K_AND cfamProperty[expr] )* )?
            {
            match(input,137,FOLLOW_137_in_cfamDefinition2222); 
            pushFollow(FOLLOW_cfamColumns_in_cfamDefinition2224);
            cfamColumns(expr);

            state._fsp--;

            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:500:29: ( ',' ( cfamColumns[expr] )? )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==139) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:500:31: ',' ( cfamColumns[expr] )?
            	    {
            	    match(input,139,FOLLOW_139_in_cfamDefinition2229); 
            	    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:500:35: ( cfamColumns[expr] )?
            	    int alt43=2;
            	    int LA43_0 = input.LA(1);

            	    if ( ((LA43_0>=K_DISTINCT && LA43_0<=K_AS)||(LA43_0>=K_FILTERING && LA43_0<=K_TTL)||LA43_0==K_VALUES||LA43_0==K_EXISTS||LA43_0==K_TIMESTAMP||LA43_0==K_COUNTER||(LA43_0>=K_STATIC && LA43_0<=K_CUSTOM)||LA43_0==IDENT||LA43_0==K_TRIGGER||LA43_0==K_TYPE||LA43_0==K_LIST||(LA43_0>=K_ALL && LA43_0<=QUOTED_NAME)||(LA43_0>=K_ASCII && LA43_0<=K_MAP)) ) {
            	        alt43=1;
            	    }
            	    switch (alt43) {
            	        case 1 :
            	            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:500:35: cfamColumns[expr]
            	            {
            	            pushFollow(FOLLOW_cfamColumns_in_cfamDefinition2231);
            	            cfamColumns(expr);

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            match(input,138,FOLLOW_138_in_cfamDefinition2238); 
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:501:7: ( K_WITH cfamProperty[expr] ( K_AND cfamProperty[expr] )* )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==K_WITH) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:501:9: K_WITH cfamProperty[expr] ( K_AND cfamProperty[expr] )*
                    {
                    match(input,K_WITH,FOLLOW_K_WITH_in_cfamDefinition2248); 
                    pushFollow(FOLLOW_cfamProperty_in_cfamDefinition2250);
                    cfamProperty(expr);

                    state._fsp--;

                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:501:35: ( K_AND cfamProperty[expr] )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==K_AND) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:501:37: K_AND cfamProperty[expr]
                    	    {
                    	    match(input,K_AND,FOLLOW_K_AND_in_cfamDefinition2255); 
                    	    pushFollow(FOLLOW_cfamProperty_in_cfamDefinition2257);
                    	    cfamProperty(expr);

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "cfamDefinition"


    // $ANTLR start "cfamColumns"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:504:1: cfamColumns[CreateTableStatement.RawStatement expr] : (k= ident v= comparatorType ( K_STATIC )? ( K_PRIMARY K_KEY )? | K_PRIMARY K_KEY '(' pkDef[expr] ( ',' c= ident )* ')' );
    public final void cfamColumns(CreateTableStatement.RawStatement expr) throws RecognitionException {
        ColumnIdentifier k = null;

        CQL3Type v = null;

        ColumnIdentifier c = null;


        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:505:5: (k= ident v= comparatorType ( K_STATIC )? ( K_PRIMARY K_KEY )? | K_PRIMARY K_KEY '(' pkDef[expr] ( ',' c= ident )* ')' )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=K_DISTINCT && LA50_0<=K_AS)||(LA50_0>=K_FILTERING && LA50_0<=K_TTL)||LA50_0==K_VALUES||LA50_0==K_EXISTS||LA50_0==K_TIMESTAMP||LA50_0==K_COUNTER||LA50_0==K_STATIC||(LA50_0>=K_KEY && LA50_0<=K_CUSTOM)||LA50_0==IDENT||LA50_0==K_TRIGGER||LA50_0==K_TYPE||LA50_0==K_LIST||(LA50_0>=K_ALL && LA50_0<=QUOTED_NAME)||(LA50_0>=K_ASCII && LA50_0<=K_MAP)) ) {
                alt50=1;
            }
            else if ( (LA50_0==K_PRIMARY) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:505:7: k= ident v= comparatorType ( K_STATIC )? ( K_PRIMARY K_KEY )?
                    {
                    pushFollow(FOLLOW_ident_in_cfamColumns2283);
                    k=ident();

                    state._fsp--;

                    pushFollow(FOLLOW_comparatorType_in_cfamColumns2287);
                    v=comparatorType();

                    state._fsp--;

                     boolean isStatic=false; 
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:505:60: ( K_STATIC )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==K_STATIC) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:505:61: K_STATIC
                            {
                            match(input,K_STATIC,FOLLOW_K_STATIC_in_cfamColumns2292); 
                            isStatic = true;

                            }
                            break;

                    }

                     expr.addDefinition(k, v, isStatic); 
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:506:9: ( K_PRIMARY K_KEY )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==K_PRIMARY) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:506:10: K_PRIMARY K_KEY
                            {
                            match(input,K_PRIMARY,FOLLOW_K_PRIMARY_in_cfamColumns2309); 
                            match(input,K_KEY,FOLLOW_K_KEY_in_cfamColumns2311); 
                             expr.addKeyAliases(Collections.singletonList(k)); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:507:7: K_PRIMARY K_KEY '(' pkDef[expr] ( ',' c= ident )* ')'
                    {
                    match(input,K_PRIMARY,FOLLOW_K_PRIMARY_in_cfamColumns2323); 
                    match(input,K_KEY,FOLLOW_K_KEY_in_cfamColumns2325); 
                    match(input,137,FOLLOW_137_in_cfamColumns2327); 
                    pushFollow(FOLLOW_pkDef_in_cfamColumns2329);
                    pkDef(expr);

                    state._fsp--;

                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:507:39: ( ',' c= ident )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==139) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:507:40: ',' c= ident
                    	    {
                    	    match(input,139,FOLLOW_139_in_cfamColumns2333); 
                    	    pushFollow(FOLLOW_ident_in_cfamColumns2337);
                    	    c=ident();

                    	    state._fsp--;

                    	     expr.addColumnAlias(c); 

                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);

                    match(input,138,FOLLOW_138_in_cfamColumns2344); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "cfamColumns"


    // $ANTLR start "pkDef"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:510:1: pkDef[CreateTableStatement.RawStatement expr] : (k= ident | '(' k1= ident ( ',' kn= ident )* ')' );
    public final void pkDef(CreateTableStatement.RawStatement expr) throws RecognitionException {
        ColumnIdentifier k = null;

        ColumnIdentifier k1 = null;

        ColumnIdentifier kn = null;


        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:511:5: (k= ident | '(' k1= ident ( ',' kn= ident )* ')' )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=K_DISTINCT && LA52_0<=K_AS)||(LA52_0>=K_FILTERING && LA52_0<=K_TTL)||LA52_0==K_VALUES||LA52_0==K_EXISTS||LA52_0==K_TIMESTAMP||LA52_0==K_COUNTER||LA52_0==K_STATIC||(LA52_0>=K_KEY && LA52_0<=K_CUSTOM)||LA52_0==IDENT||LA52_0==K_TRIGGER||LA52_0==K_TYPE||LA52_0==K_LIST||(LA52_0>=K_ALL && LA52_0<=QUOTED_NAME)||(LA52_0>=K_ASCII && LA52_0<=K_MAP)) ) {
                alt52=1;
            }
            else if ( (LA52_0==137) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:511:7: k= ident
                    {
                    pushFollow(FOLLOW_ident_in_pkDef2364);
                    k=ident();

                    state._fsp--;

                     expr.addKeyAliases(Collections.singletonList(k)); 

                    }
                    break;
                case 2 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:512:7: '(' k1= ident ( ',' kn= ident )* ')'
                    {
                    match(input,137,FOLLOW_137_in_pkDef2374); 
                     List<ColumnIdentifier> l = new ArrayList<ColumnIdentifier>(); 
                    pushFollow(FOLLOW_ident_in_pkDef2380);
                    k1=ident();

                    state._fsp--;

                     l.add(k1); 
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:512:101: ( ',' kn= ident )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==139) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:512:103: ',' kn= ident
                    	    {
                    	    match(input,139,FOLLOW_139_in_pkDef2386); 
                    	    pushFollow(FOLLOW_ident_in_pkDef2390);
                    	    kn=ident();

                    	    state._fsp--;

                    	     l.add(kn); 

                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);

                    match(input,138,FOLLOW_138_in_pkDef2397); 
                     expr.addKeyAliases(l); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "pkDef"


    // $ANTLR start "cfamProperty"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:515:1: cfamProperty[CreateTableStatement.RawStatement expr] : ( property[expr.properties] | K_COMPACT K_STORAGE | K_CLUSTERING K_ORDER K_BY '(' cfamOrdering[expr] ( ',' cfamOrdering[expr] )* ')' );
    public final void cfamProperty(CreateTableStatement.RawStatement expr) throws RecognitionException {
        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:516:5: ( property[expr.properties] | K_COMPACT K_STORAGE | K_CLUSTERING K_ORDER K_BY '(' cfamOrdering[expr] ( ',' cfamOrdering[expr] )* ')' )
            int alt54=3;
            switch ( input.LA(1) ) {
            case K_DISTINCT:
            case K_COUNT:
            case K_AS:
            case K_FILTERING:
            case K_WRITETIME:
            case K_TTL:
            case K_VALUES:
            case K_EXISTS:
            case K_TIMESTAMP:
            case K_COUNTER:
            case K_STATIC:
            case K_KEY:
            case K_STORAGE:
            case K_CUSTOM:
            case IDENT:
            case K_TRIGGER:
            case K_TYPE:
            case K_LIST:
            case K_ALL:
            case K_PERMISSIONS:
            case K_PERMISSION:
            case K_KEYSPACES:
            case K_USER:
            case K_SUPERUSER:
            case K_NOSUPERUSER:
            case K_USERS:
            case K_PASSWORD:
            case QUOTED_NAME:
            case K_ASCII:
            case K_BIGINT:
            case K_BLOB:
            case K_BOOLEAN:
            case K_DECIMAL:
            case K_DOUBLE:
            case K_FLOAT:
            case K_INET:
            case K_INT:
            case K_TEXT:
            case K_UUID:
            case K_VARCHAR:
            case K_VARINT:
            case K_TIMEUUID:
            case K_MAP:
                {
                alt54=1;
                }
                break;
            case K_COMPACT:
                {
                int LA54_2 = input.LA(2);

                if ( (LA54_2==K_STORAGE) ) {
                    alt54=2;
                }
                else if ( (LA54_2==148) ) {
                    alt54=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 2, input);

                    throw nvae;
                }
                }
                break;
            case K_CLUSTERING:
                {
                int LA54_3 = input.LA(2);

                if ( (LA54_3==K_ORDER) ) {
                    alt54=3;
                }
                else if ( (LA54_3==148) ) {
                    alt54=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:516:7: property[expr.properties]
                    {
                    pushFollow(FOLLOW_property_in_cfamProperty2417);
                    property(expr.properties);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:517:7: K_COMPACT K_STORAGE
                    {
                    match(input,K_COMPACT,FOLLOW_K_COMPACT_in_cfamProperty2426); 
                    match(input,K_STORAGE,FOLLOW_K_STORAGE_in_cfamProperty2428); 
                     expr.setCompactStorage(); 

                    }
                    break;
                case 3 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:518:7: K_CLUSTERING K_ORDER K_BY '(' cfamOrdering[expr] ( ',' cfamOrdering[expr] )* ')'
                    {
                    match(input,K_CLUSTERING,FOLLOW_K_CLUSTERING_in_cfamProperty2438); 
                    match(input,K_ORDER,FOLLOW_K_ORDER_in_cfamProperty2440); 
                    match(input,K_BY,FOLLOW_K_BY_in_cfamProperty2442); 
                    match(input,137,FOLLOW_137_in_cfamProperty2444); 
                    pushFollow(FOLLOW_cfamOrdering_in_cfamProperty2446);
                    cfamOrdering(expr);

                    state._fsp--;

                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:518:56: ( ',' cfamOrdering[expr] )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==139) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:518:57: ',' cfamOrdering[expr]
                    	    {
                    	    match(input,139,FOLLOW_139_in_cfamProperty2450); 
                    	    pushFollow(FOLLOW_cfamOrdering_in_cfamProperty2452);
                    	    cfamOrdering(expr);

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);

                    match(input,138,FOLLOW_138_in_cfamProperty2457); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "cfamProperty"


    // $ANTLR start "cfamOrdering"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:521:1: cfamOrdering[CreateTableStatement.RawStatement expr] : k= ident ( K_ASC | K_DESC ) ;
    public final void cfamOrdering(CreateTableStatement.RawStatement expr) throws RecognitionException {
        ColumnIdentifier k = null;


         boolean reversed=false; 
        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:523:5: (k= ident ( K_ASC | K_DESC ) )
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:523:7: k= ident ( K_ASC | K_DESC )
            {
            pushFollow(FOLLOW_ident_in_cfamOrdering2485);
            k=ident();

            state._fsp--;

            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:523:15: ( K_ASC | K_DESC )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==K_ASC) ) {
                alt55=1;
            }
            else if ( (LA55_0==K_DESC) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:523:16: K_ASC
                    {
                    match(input,K_ASC,FOLLOW_K_ASC_in_cfamOrdering2488); 

                    }
                    break;
                case 2 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:523:24: K_DESC
                    {
                    match(input,K_DESC,FOLLOW_K_DESC_in_cfamOrdering2492); 
                     reversed=true;

                    }
                    break;

            }

             expr.setOrdering(k, reversed); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "cfamOrdering"


    // $ANTLR start "createIndexStatement"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:526:1: createIndexStatement returns [CreateIndexStatement expr] : K_CREATE ( K_CUSTOM )? K_INDEX ( K_IF K_NOT K_EXISTS )? (idxName= IDENT )? K_ON cf= columnFamilyName '(' id= cident ')' ( K_USING cls= STRING_LITERAL )? ( K_WITH properties[props] )? ;
    public final CreateIndexStatement createIndexStatement() throws RecognitionException {
        CreateIndexStatement expr = null;

        Token idxName=null;
        Token cls=null;
        CFName cf = null;

        ColumnIdentifier.Raw id = null;



                IndexPropDefs props = new IndexPropDefs();
                boolean ifNotExists = false;
            
        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:535:5: ( K_CREATE ( K_CUSTOM )? K_INDEX ( K_IF K_NOT K_EXISTS )? (idxName= IDENT )? K_ON cf= columnFamilyName '(' id= cident ')' ( K_USING cls= STRING_LITERAL )? ( K_WITH properties[props] )? )
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:535:7: K_CREATE ( K_CUSTOM )? K_INDEX ( K_IF K_NOT K_EXISTS )? (idxName= IDENT )? K_ON cf= columnFamilyName '(' id= cident ')' ( K_USING cls= STRING_LITERAL )? ( K_WITH properties[props] )?
            {
            match(input,K_CREATE,FOLLOW_K_CREATE_in_createIndexStatement2530); 
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:535:16: ( K_CUSTOM )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==K_CUSTOM) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:535:17: K_CUSTOM
                    {
                    match(input,K_CUSTOM,FOLLOW_K_CUSTOM_in_createIndexStatement2533); 
                     props.isCustom = true; 

                    }
                    break;

            }

            match(input,K_INDEX,FOLLOW_K_INDEX_in_createIndexStatement2539); 
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:535:63: ( K_IF K_NOT K_EXISTS )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==K_IF) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:535:64: K_IF K_NOT K_EXISTS
                    {
                    match(input,K_IF,FOLLOW_K_IF_in_createIndexStatement2542); 
                    match(input,K_NOT,FOLLOW_K_NOT_in_createIndexStatement2544); 
                    match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createIndexStatement2546); 
                     ifNotExists = true; 

                    }
                    break;

            }

            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:536:9: (idxName= IDENT )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==IDENT) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:536:10: idxName= IDENT
                    {
                    idxName=(Token)match(input,IDENT,FOLLOW_IDENT_in_createIndexStatement2564); 

                    }
                    break;

            }

            match(input,K_ON,FOLLOW_K_ON_in_createIndexStatement2568); 
            pushFollow(FOLLOW_columnFamilyName_in_createIndexStatement2572);
            cf=columnFamilyName();

            state._fsp--;

            match(input,137,FOLLOW_137_in_createIndexStatement2574); 
            pushFollow(FOLLOW_cident_in_createIndexStatement2578);
            id=cident();

            state._fsp--;

            match(input,138,FOLLOW_138_in_createIndexStatement2580); 
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:537:9: ( K_USING cls= STRING_LITERAL )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==K_USING) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:537:10: K_USING cls= STRING_LITERAL
                    {
                    match(input,K_USING,FOLLOW_K_USING_in_createIndexStatement2591); 
                    cls=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_createIndexStatement2595); 
                     props.customClass = (cls!=null?cls.getText():null); 

                    }
                    break;

            }

            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:538:9: ( K_WITH properties[props] )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==K_WITH) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:538:10: K_WITH properties[props]
                    {
                    match(input,K_WITH,FOLLOW_K_WITH_in_createIndexStatement2610); 
                    pushFollow(FOLLOW_properties_in_createIndexStatement2612);
                    properties(props);

                    state._fsp--;


                    }
                    break;

            }

             expr = new CreateIndexStatement(cf, (idxName!=null?idxName.getText():null), id, props, ifNotExists); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "createIndexStatement"


    // $ANTLR start "createTriggerStatement"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:542:1: createTriggerStatement returns [CreateTriggerStatement expr] : K_CREATE K_TRIGGER (name= IDENT ) K_ON cf= columnFamilyName K_USING cls= STRING_LITERAL ;
    public final CreateTriggerStatement createTriggerStatement() throws RecognitionException {
        CreateTriggerStatement expr = null;

        Token name=null;
        Token cls=null;
        CFName cf = null;


        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:546:5: ( K_CREATE K_TRIGGER (name= IDENT ) K_ON cf= columnFamilyName K_USING cls= STRING_LITERAL )
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:546:7: K_CREATE K_TRIGGER (name= IDENT ) K_ON cf= columnFamilyName K_USING cls= STRING_LITERAL
            {
            match(input,K_CREATE,FOLLOW_K_CREATE_in_createTriggerStatement2646); 
            match(input,K_TRIGGER,FOLLOW_K_TRIGGER_in_createTriggerStatement2648); 
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:546:26: (name= IDENT )
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:546:27: name= IDENT
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_createTriggerStatement2653); 

            }

            match(input,K_ON,FOLLOW_K_ON_in_createTriggerStatement2656); 
            pushFollow(FOLLOW_columnFamilyName_in_createTriggerStatement2660);
            cf=columnFamilyName();

            state._fsp--;

            match(input,K_USING,FOLLOW_K_USING_in_createTriggerStatement2662); 
            cls=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_createTriggerStatement2666); 
             expr = new CreateTriggerStatement(cf, (name!=null?name.getText():null), (cls!=null?cls.getText():null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "createTriggerStatement"


    // $ANTLR start "dropTriggerStatement"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:550:1: dropTriggerStatement returns [DropTriggerStatement expr] : K_DROP K_TRIGGER (name= IDENT ) K_ON cf= columnFamilyName ;
    public final DropTriggerStatement dropTriggerStatement() throws RecognitionException {
        DropTriggerStatement expr = null;

        Token name=null;
        CFName cf = null;


        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:554:5: ( K_DROP K_TRIGGER (name= IDENT ) K_ON cf= columnFamilyName )
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:554:7: K_DROP K_TRIGGER (name= IDENT ) K_ON cf= columnFamilyName
            {
            match(input,K_DROP,FOLLOW_K_DROP_in_dropTriggerStatement2697); 
            match(input,K_TRIGGER,FOLLOW_K_TRIGGER_in_dropTriggerStatement2699); 
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:554:24: (name= IDENT )
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:554:25: name= IDENT
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_dropTriggerStatement2704); 

            }

            match(input,K_ON,FOLLOW_K_ON_in_dropTriggerStatement2707); 
            pushFollow(FOLLOW_columnFamilyName_in_dropTriggerStatement2711);
            cf=columnFamilyName();

            state._fsp--;

             expr = new DropTriggerStatement(cf, (name!=null?name.getText():null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "dropTriggerStatement"


    // $ANTLR start "alterKeyspaceStatement"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:558:1: alterKeyspaceStatement returns [AlterKeyspaceStatement expr] : K_ALTER K_KEYSPACE ks= keyspaceName K_WITH properties[attrs] ;
    public final AlterKeyspaceStatement alterKeyspaceStatement() throws RecognitionException {
        AlterKeyspaceStatement expr = null;

        String ks = null;


         KSPropDefs attrs = new KSPropDefs(); 
        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:563:5: ( K_ALTER K_KEYSPACE ks= keyspaceName K_WITH properties[attrs] )
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:563:7: K_ALTER K_KEYSPACE ks= keyspaceName K_WITH properties[attrs]
            {
            match(input,K_ALTER,FOLLOW_K_ALTER_in_alterKeyspaceStatement2751); 
            match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_alterKeyspaceStatement2753); 
            pushFollow(FOLLOW_keyspaceName_in_alterKeyspaceStatement2757);
            ks=keyspaceName();

            state._fsp--;

            match(input,K_WITH,FOLLOW_K_WITH_in_alterKeyspaceStatement2767); 
            pushFollow(FOLLOW_properties_in_alterKeyspaceStatement2769);
            properties(attrs);

            state._fsp--;

             expr = new AlterKeyspaceStatement(ks, attrs); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "alterKeyspaceStatement"


    // $ANTLR start "alterTableStatement"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:568:1: alterTableStatement returns [AlterTableStatement expr] : K_ALTER K_COLUMNFAMILY cf= columnFamilyName ( K_ALTER id= cident K_TYPE v= comparatorType | K_ADD id= cident v= comparatorType ( K_STATIC )? | K_DROP id= cident | K_WITH properties[props] | K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )* ) ;
    public final AlterTableStatement alterTableStatement() throws RecognitionException {
        AlterTableStatement expr = null;

        CFName cf = null;

        ColumnIdentifier.Raw id = null;

        CQL3Type v = null;

        ColumnIdentifier.Raw id1 = null;

        ColumnIdentifier.Raw toId1 = null;

        ColumnIdentifier.Raw idn = null;

        ColumnIdentifier.Raw toIdn = null;



                AlterTableStatement.Type type = null;
                CFPropDefs props = new CFPropDefs();
                Map<ColumnIdentifier.Raw, ColumnIdentifier.Raw> renames = new HashMap<ColumnIdentifier.Raw, ColumnIdentifier.Raw>();
                boolean isStatic = false;
            
        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:582:5: ( K_ALTER K_COLUMNFAMILY cf= columnFamilyName ( K_ALTER id= cident K_TYPE v= comparatorType | K_ADD id= cident v= comparatorType ( K_STATIC )? | K_DROP id= cident | K_WITH properties[props] | K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )* ) )
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:582:7: K_ALTER K_COLUMNFAMILY cf= columnFamilyName ( K_ALTER id= cident K_TYPE v= comparatorType | K_ADD id= cident v= comparatorType ( K_STATIC )? | K_DROP id= cident | K_WITH properties[props] | K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )* )
            {
            match(input,K_ALTER,FOLLOW_K_ALTER_in_alterTableStatement2805); 
            match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_alterTableStatement2807); 
            pushFollow(FOLLOW_columnFamilyName_in_alterTableStatement2811);
            cf=columnFamilyName();

            state._fsp--;

            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:583:11: ( K_ALTER id= cident K_TYPE v= comparatorType | K_ADD id= cident v= comparatorType ( K_STATIC )? | K_DROP id= cident | K_WITH properties[props] | K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )* )
            int alt63=5;
            switch ( input.LA(1) ) {
            case K_ALTER:
                {
                alt63=1;
                }
                break;
            case K_ADD:
                {
                alt63=2;
                }
                break;
            case K_DROP:
                {
                alt63=3;
                }
                break;
            case K_WITH:
                {
                alt63=4;
                }
                break;
            case K_RENAME:
                {
                alt63=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:583:13: K_ALTER id= cident K_TYPE v= comparatorType
                    {
                    match(input,K_ALTER,FOLLOW_K_ALTER_in_alterTableStatement2825); 
                    pushFollow(FOLLOW_cident_in_alterTableStatement2829);
                    id=cident();

                    state._fsp--;

                    match(input,K_TYPE,FOLLOW_K_TYPE_in_alterTableStatement2831); 
                    pushFollow(FOLLOW_comparatorType_in_alterTableStatement2835);
                    v=comparatorType();

                    state._fsp--;

                     type = AlterTableStatement.Type.ALTER; 

                    }
                    break;
                case 2 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:584:13: K_ADD id= cident v= comparatorType ( K_STATIC )?
                    {
                    match(input,K_ADD,FOLLOW_K_ADD_in_alterTableStatement2851); 
                    pushFollow(FOLLOW_cident_in_alterTableStatement2857);
                    id=cident();

                    state._fsp--;

                    pushFollow(FOLLOW_comparatorType_in_alterTableStatement2861);
                    v=comparatorType();

                    state._fsp--;

                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:584:48: ( K_STATIC )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==K_STATIC) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:584:49: K_STATIC
                            {
                             isStatic=true; 
                            match(input,K_STATIC,FOLLOW_K_STATIC_in_alterTableStatement2866); 

                            }
                            break;

                    }

                     type = AlterTableStatement.Type.ADD; 

                    }
                    break;
                case 3 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:585:13: K_DROP id= cident
                    {
                    match(input,K_DROP,FOLLOW_K_DROP_in_alterTableStatement2884); 
                    pushFollow(FOLLOW_cident_in_alterTableStatement2889);
                    id=cident();

                    state._fsp--;

                     type = AlterTableStatement.Type.DROP; 

                    }
                    break;
                case 4 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:586:13: K_WITH properties[props]
                    {
                    match(input,K_WITH,FOLLOW_K_WITH_in_alterTableStatement2929); 
                    pushFollow(FOLLOW_properties_in_alterTableStatement2932);
                    properties(props);

                    state._fsp--;

                     type = AlterTableStatement.Type.OPTS; 

                    }
                    break;
                case 5 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:587:13: K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )*
                    {
                    match(input,K_RENAME,FOLLOW_K_RENAME_in_alterTableStatement2965); 
                     type = AlterTableStatement.Type.RENAME; 
                    pushFollow(FOLLOW_cident_in_alterTableStatement3019);
                    id1=cident();

                    state._fsp--;

                    match(input,K_TO,FOLLOW_K_TO_in_alterTableStatement3021); 
                    pushFollow(FOLLOW_cident_in_alterTableStatement3025);
                    toId1=cident();

                    state._fsp--;

                     renames.put(id1, toId1); 
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:589:16: ( K_AND idn= cident K_TO toIdn= cident )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==K_AND) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:589:18: K_AND idn= cident K_TO toIdn= cident
                    	    {
                    	    match(input,K_AND,FOLLOW_K_AND_in_alterTableStatement3046); 
                    	    pushFollow(FOLLOW_cident_in_alterTableStatement3050);
                    	    idn=cident();

                    	    state._fsp--;

                    	    match(input,K_TO,FOLLOW_K_TO_in_alterTableStatement3052); 
                    	    pushFollow(FOLLOW_cident_in_alterTableStatement3056);
                    	    toIdn=cident();

                    	    state._fsp--;

                    	     renames.put(idn, toIdn); 

                    	    }
                    	    break;

                    	default :
                    	    break loop62;
                        }
                    } while (true);


                    }
                    break;

            }


                    expr = new AlterTableStatement(cf, type, id, v, props, renames, isStatic);
                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "alterTableStatement"


    // $ANTLR start "dropKeyspaceStatement"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:596:1: dropKeyspaceStatement returns [DropKeyspaceStatement ksp] : K_DROP K_KEYSPACE ( K_IF K_EXISTS )? ks= keyspaceName ;
    public final DropKeyspaceStatement dropKeyspaceStatement() throws RecognitionException {
        DropKeyspaceStatement ksp = null;

        String ks = null;


         boolean ifExists = false; 
        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:601:5: ( K_DROP K_KEYSPACE ( K_IF K_EXISTS )? ks= keyspaceName )
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:601:7: K_DROP K_KEYSPACE ( K_IF K_EXISTS )? ks= keyspaceName
            {
            match(input,K_DROP,FOLLOW_K_DROP_in_dropKeyspaceStatement3111); 
            match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_dropKeyspaceStatement3113); 
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:601:25: ( K_IF K_EXISTS )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==K_IF) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:601:26: K_IF K_EXISTS
                    {
                    match(input,K_IF,FOLLOW_K_IF_in_dropKeyspaceStatement3116); 
                    match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropKeyspaceStatement3118); 
                     ifExists = true; 

                    }
                    break;

            }

            pushFollow(FOLLOW_keyspaceName_in_dropKeyspaceStatement3127);
            ks=keyspaceName();

            state._fsp--;

             ksp = new DropKeyspaceStatement(ks, ifExists); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ksp;
    }
    // $ANTLR end "dropKeyspaceStatement"


    // $ANTLR start "dropTableStatement"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:604:1: dropTableStatement returns [DropTableStatement stmt] : K_DROP K_COLUMNFAMILY ( K_IF K_EXISTS )? cf= columnFamilyName ;
    public final DropTableStatement dropTableStatement() throws RecognitionException {
        DropTableStatement stmt = null;

        CFName cf = null;


         boolean ifExists = false; 
        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:609:5: ( K_DROP K_COLUMNFAMILY ( K_IF K_EXISTS )? cf= columnFamilyName )
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:609:7: K_DROP K_COLUMNFAMILY ( K_IF K_EXISTS )? cf= columnFamilyName
            {
            match(input,K_DROP,FOLLOW_K_DROP_in_dropTableStatement3161); 
            match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_dropTableStatement3163); 
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:609:29: ( K_IF K_EXISTS )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==K_IF) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:609:30: K_IF K_EXISTS
                    {
                    match(input,K_IF,FOLLOW_K_IF_in_dropTableStatement3166); 
                    match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropTableStatement3168); 
                     ifExists = true; 

                    }
                    break;

            }

            pushFollow(FOLLOW_columnFamilyName_in_dropTableStatement3177);
            cf=columnFamilyName();

            state._fsp--;

             stmt = new DropTableStatement(cf, ifExists); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "dropTableStatement"


    // $ANTLR start "dropIndexStatement"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:612:1: dropIndexStatement returns [DropIndexStatement expr] : K_DROP K_INDEX ( K_IF K_EXISTS )? index= IDENT ;
    public final DropIndexStatement dropIndexStatement() throws RecognitionException {
        DropIndexStatement expr = null;

        Token index=null;

         boolean ifExists = false; 
        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:617:5: ( K_DROP K_INDEX ( K_IF K_EXISTS )? index= IDENT )
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:617:7: K_DROP K_INDEX ( K_IF K_EXISTS )? index= IDENT
            {
            match(input,K_DROP,FOLLOW_K_DROP_in_dropIndexStatement3211); 
            match(input,K_INDEX,FOLLOW_K_INDEX_in_dropIndexStatement3213); 
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:617:22: ( K_IF K_EXISTS )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==K_IF) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:617:23: K_IF K_EXISTS
                    {
                    match(input,K_IF,FOLLOW_K_IF_in_dropIndexStatement3216); 
                    match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropIndexStatement3218); 
                     ifExists = true; 

                    }
                    break;

            }

            index=(Token)match(input,IDENT,FOLLOW_IDENT_in_dropIndexStatement3227); 
             expr = new DropIndexStatement((index!=null?index.getText():null), ifExists); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "dropIndexStatement"


    // $ANTLR start "truncateStatement"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:621:1: truncateStatement returns [TruncateStatement stmt] : K_TRUNCATE cf= columnFamilyName ;
    public final TruncateStatement truncateStatement() throws RecognitionException {
        TruncateStatement stmt = null;

        CFName cf = null;


        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:625:5: ( K_TRUNCATE cf= columnFamilyName )
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:625:7: K_TRUNCATE cf= columnFamilyName
            {
            match(input,K_TRUNCATE,FOLLOW_K_TRUNCATE_in_truncateStatement3258); 
            pushFollow(FOLLOW_columnFamilyName_in_truncateStatement3262);
            cf=columnFamilyName();

            state._fsp--;

             stmt = new TruncateStatement(cf); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "truncateStatement"


    // $ANTLR start "grantStatement"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:628:1: grantStatement returns [GrantStatement stmt] : K_GRANT permissionOrAll K_ON resource K_TO username ;
    public final GrantStatement grantStatement() throws RecognitionException {
        GrantStatement stmt = null;

        Set<Permission> permissionOrAll1 = null;

        IResource resource2 = null;

        CqlParser.username_return username3 = null;


        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:632:5: ( K_GRANT permissionOrAll K_ON resource K_TO username )
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:632:7: K_GRANT permissionOrAll K_ON resource K_TO username
            {
            match(input,K_GRANT,FOLLOW_K_GRANT_in_grantStatement3287); 
            pushFollow(FOLLOW_permissionOrAll_in_grantStatement3299);
            permissionOrAll1=permissionOrAll();

            state._fsp--;

            match(input,K_ON,FOLLOW_K_ON_in_grantStatement3307); 
            pushFollow(FOLLOW_resource_in_grantStatement3319);
            resource2=resource();

            state._fsp--;

            match(input,K_TO,FOLLOW_K_TO_in_grantStatement3327); 
            pushFollow(FOLLOW_username_in_grantStatement3339);
            username3=username();

            state._fsp--;

             stmt = new GrantStatement(permissionOrAll1, resource2, (username3!=null?input.toString(username3.start,username3.stop):null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "grantStatement"


    // $ANTLR start "revokeStatement"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:641:1: revokeStatement returns [RevokeStatement stmt] : K_REVOKE permissionOrAll K_ON resource K_FROM username ;
    public final RevokeStatement revokeStatement() throws RecognitionException {
        RevokeStatement stmt = null;

        Set<Permission> permissionOrAll4 = null;

        IResource resource5 = null;

        CqlParser.username_return username6 = null;


        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:645:5: ( K_REVOKE permissionOrAll K_ON resource K_FROM username )
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:645:7: K_REVOKE permissionOrAll K_ON resource K_FROM username
            {
            match(input,K_REVOKE,FOLLOW_K_REVOKE_in_revokeStatement3370); 
            pushFollow(FOLLOW_permissionOrAll_in_revokeStatement3382);
            permissionOrAll4=permissionOrAll();

            state._fsp--;

            match(input,K_ON,FOLLOW_K_ON_in_revokeStatement3390); 
            pushFollow(FOLLOW_resource_in_revokeStatement3402);
            resource5=resource();

            state._fsp--;

            match(input,K_FROM,FOLLOW_K_FROM_in_revokeStatement3410); 
            pushFollow(FOLLOW_username_in_revokeStatement3422);
            username6=username();

            state._fsp--;

             stmt = new RevokeStatement(permissionOrAll4, resource5, (username6!=null?input.toString(username6.start,username6.stop):null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "revokeStatement"


    // $ANTLR start "listPermissionsStatement"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:654:1: listPermissionsStatement returns [ListPermissionsStatement stmt] : K_LIST permissionOrAll ( K_ON resource )? ( K_OF username )? ( K_NORECURSIVE )? ;
    public final ListPermissionsStatement listPermissionsStatement() throws RecognitionException {
        ListPermissionsStatement stmt = null;

        IResource resource7 = null;

        CqlParser.username_return username8 = null;

        Set<Permission> permissionOrAll9 = null;



                IResource resource = null;
                String username = null;
                boolean recursive = true;
            
        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:660:5: ( K_LIST permissionOrAll ( K_ON resource )? ( K_OF username )? ( K_NORECURSIVE )? )
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:660:7: K_LIST permissionOrAll ( K_ON resource )? ( K_OF username )? ( K_NORECURSIVE )?
            {
            match(input,K_LIST,FOLLOW_K_LIST_in_listPermissionsStatement3460); 
            pushFollow(FOLLOW_permissionOrAll_in_listPermissionsStatement3472);
            permissionOrAll9=permissionOrAll();

            state._fsp--;

            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:662:7: ( K_ON resource )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==K_ON) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:662:9: K_ON resource
                    {
                    match(input,K_ON,FOLLOW_K_ON_in_listPermissionsStatement3482); 
                    pushFollow(FOLLOW_resource_in_listPermissionsStatement3484);
                    resource7=resource();

                    state._fsp--;

                     resource = resource7; 

                    }
                    break;

            }

            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:663:7: ( K_OF username )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==K_OF) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:663:9: K_OF username
                    {
                    match(input,K_OF,FOLLOW_K_OF_in_listPermissionsStatement3499); 
                    pushFollow(FOLLOW_username_in_listPermissionsStatement3501);
                    username8=username();

                    state._fsp--;

                     username = (username8!=null?input.toString(username8.start,username8.stop):null); 

                    }
                    break;

            }

            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:664:7: ( K_NORECURSIVE )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==K_NORECURSIVE) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:664:9: K_NORECURSIVE
                    {
                    match(input,K_NORECURSIVE,FOLLOW_K_NORECURSIVE_in_listPermissionsStatement3516); 
                     recursive = false; 

                    }
                    break;

            }

             stmt = new ListPermissionsStatement(permissionOrAll9, resource, username, recursive); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "listPermissionsStatement"


    // $ANTLR start "permission"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:668:1: permission returns [Permission perm] : p= ( K_CREATE | K_ALTER | K_DROP | K_SELECT | K_MODIFY | K_AUTHORIZE ) ;
    public final Permission permission() throws RecognitionException {
        Permission perm = null;

        Token p=null;

        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:669:5: (p= ( K_CREATE | K_ALTER | K_DROP | K_SELECT | K_MODIFY | K_AUTHORIZE ) )
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:669:7: p= ( K_CREATE | K_ALTER | K_DROP | K_SELECT | K_MODIFY | K_AUTHORIZE )
            {
            p=(Token)input.LT(1);
            if ( input.LA(1)==K_SELECT||input.LA(1)==K_CREATE||(input.LA(1)>=K_DROP && input.LA(1)<=K_ALTER)||(input.LA(1)>=K_MODIFY && input.LA(1)<=K_AUTHORIZE) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             perm = Permission.valueOf((p!=null?p.getText():null).toUpperCase()); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return perm;
    }
    // $ANTLR end "permission"


    // $ANTLR start "permissionOrAll"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:673:1: permissionOrAll returns [Set<Permission> perms] : ( K_ALL ( K_PERMISSIONS )? | p= permission ( K_PERMISSION )? );
    public final Set<Permission> permissionOrAll() throws RecognitionException {
        Set<Permission> perms = null;

        Permission p = null;


        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:674:5: ( K_ALL ( K_PERMISSIONS )? | p= permission ( K_PERMISSION )? )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==K_ALL) ) {
                alt72=1;
            }
            else if ( (LA72_0==K_SELECT||LA72_0==K_CREATE||(LA72_0>=K_DROP && LA72_0<=K_ALTER)||(LA72_0>=K_MODIFY && LA72_0<=K_AUTHORIZE)) ) {
                alt72=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:674:7: K_ALL ( K_PERMISSIONS )?
                    {
                    match(input,K_ALL,FOLLOW_K_ALL_in_permissionOrAll3601); 
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:674:13: ( K_PERMISSIONS )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==K_PERMISSIONS) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:674:15: K_PERMISSIONS
                            {
                            match(input,K_PERMISSIONS,FOLLOW_K_PERMISSIONS_in_permissionOrAll3605); 

                            }
                            break;

                    }

                     perms = Permission.ALL_DATA; 

                    }
                    break;
                case 2 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:675:7: p= permission ( K_PERMISSION )?
                    {
                    pushFollow(FOLLOW_permission_in_permissionOrAll3626);
                    p=permission();

                    state._fsp--;

                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:675:20: ( K_PERMISSION )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==K_PERMISSION) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:675:22: K_PERMISSION
                            {
                            match(input,K_PERMISSION,FOLLOW_K_PERMISSION_in_permissionOrAll3630); 

                            }
                            break;

                    }

                     perms = EnumSet.of(p); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return perms;
    }
    // $ANTLR end "permissionOrAll"


    // $ANTLR start "resource"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:678:1: resource returns [IResource res] : r= dataResource ;
    public final IResource resource() throws RecognitionException {
        IResource res = null;

        DataResource r = null;


        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:679:5: (r= dataResource )
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:679:7: r= dataResource
            {
            pushFollow(FOLLOW_dataResource_in_resource3658);
            r=dataResource();

            state._fsp--;

             res = r; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return res;
    }
    // $ANTLR end "resource"


    // $ANTLR start "dataResource"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:682:1: dataResource returns [DataResource res] : ( K_ALL K_KEYSPACES | K_KEYSPACE ks= keyspaceName | ( K_COLUMNFAMILY )? cf= columnFamilyName );
    public final DataResource dataResource() throws RecognitionException {
        DataResource res = null;

        String ks = null;

        CFName cf = null;


        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:683:5: ( K_ALL K_KEYSPACES | K_KEYSPACE ks= keyspaceName | ( K_COLUMNFAMILY )? cf= columnFamilyName )
            int alt74=3;
            switch ( input.LA(1) ) {
            case K_ALL:
                {
                int LA74_1 = input.LA(2);

                if ( (LA74_1==K_KEYSPACES) ) {
                    alt74=1;
                }
                else if ( (LA74_1==EOF||LA74_1==K_FROM||LA74_1==K_TO||(LA74_1>=K_OF && LA74_1<=K_NORECURSIVE)||LA74_1==136||LA74_1==143) ) {
                    alt74=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 74, 1, input);

                    throw nvae;
                }
                }
                break;
            case K_KEYSPACE:
                {
                alt74=2;
                }
                break;
            case K_DISTINCT:
            case K_COUNT:
            case K_AS:
            case K_FILTERING:
            case K_WRITETIME:
            case K_TTL:
            case K_VALUES:
            case K_EXISTS:
            case K_TIMESTAMP:
            case K_COUNTER:
            case K_COLUMNFAMILY:
            case K_STATIC:
            case K_KEY:
            case K_COMPACT:
            case K_STORAGE:
            case K_CLUSTERING:
            case K_CUSTOM:
            case IDENT:
            case K_TRIGGER:
            case K_TYPE:
            case K_LIST:
            case K_PERMISSIONS:
            case K_PERMISSION:
            case K_KEYSPACES:
            case K_USER:
            case K_SUPERUSER:
            case K_NOSUPERUSER:
            case K_USERS:
            case K_PASSWORD:
            case QUOTED_NAME:
            case QMARK:
            case K_ASCII:
            case K_BIGINT:
            case K_BLOB:
            case K_BOOLEAN:
            case K_DECIMAL:
            case K_DOUBLE:
            case K_FLOAT:
            case K_INET:
            case K_INT:
            case K_TEXT:
            case K_UUID:
            case K_VARCHAR:
            case K_VARINT:
            case K_TIMEUUID:
            case K_MAP:
                {
                alt74=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:683:7: K_ALL K_KEYSPACES
                    {
                    match(input,K_ALL,FOLLOW_K_ALL_in_dataResource3681); 
                    match(input,K_KEYSPACES,FOLLOW_K_KEYSPACES_in_dataResource3683); 
                     res = DataResource.root(); 

                    }
                    break;
                case 2 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:684:7: K_KEYSPACE ks= keyspaceName
                    {
                    match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_dataResource3693); 
                    pushFollow(FOLLOW_keyspaceName_in_dataResource3699);
                    ks=keyspaceName();

                    state._fsp--;

                     res = DataResource.keyspace(ks); 

                    }
                    break;
                case 3 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:685:7: ( K_COLUMNFAMILY )? cf= columnFamilyName
                    {
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:685:7: ( K_COLUMNFAMILY )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==K_COLUMNFAMILY) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:685:9: K_COLUMNFAMILY
                            {
                            match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_dataResource3711); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_columnFamilyName_in_dataResource3720);
                    cf=columnFamilyName();

                    state._fsp--;

                     res = DataResource.columnFamily(cf.getKeyspace(), cf.getColumnFamily()); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return res;
    }
    // $ANTLR end "dataResource"


    // $ANTLR start "createUserStatement"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:689:1: createUserStatement returns [CreateUserStatement stmt] : K_CREATE K_USER ( K_IF K_NOT K_EXISTS )? username ( K_WITH userOptions[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )? ;
    public final CreateUserStatement createUserStatement() throws RecognitionException {
        CreateUserStatement stmt = null;

        CqlParser.username_return username10 = null;



                UserOptions opts = new UserOptions();
                boolean superuser = false;
                boolean ifNotExists = false;
            
        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:698:5: ( K_CREATE K_USER ( K_IF K_NOT K_EXISTS )? username ( K_WITH userOptions[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )? )
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:698:7: K_CREATE K_USER ( K_IF K_NOT K_EXISTS )? username ( K_WITH userOptions[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )?
            {
            match(input,K_CREATE,FOLLOW_K_CREATE_in_createUserStatement3760); 
            match(input,K_USER,FOLLOW_K_USER_in_createUserStatement3762); 
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:698:23: ( K_IF K_NOT K_EXISTS )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==K_IF) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:698:24: K_IF K_NOT K_EXISTS
                    {
                    match(input,K_IF,FOLLOW_K_IF_in_createUserStatement3765); 
                    match(input,K_NOT,FOLLOW_K_NOT_in_createUserStatement3767); 
                    match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createUserStatement3769); 
                     ifNotExists = true; 

                    }
                    break;

            }

            pushFollow(FOLLOW_username_in_createUserStatement3775);
            username10=username();

            state._fsp--;

            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:699:7: ( K_WITH userOptions[opts] )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==K_WITH) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:699:9: K_WITH userOptions[opts]
                    {
                    match(input,K_WITH,FOLLOW_K_WITH_in_createUserStatement3785); 
                    pushFollow(FOLLOW_userOptions_in_createUserStatement3787);
                    userOptions(opts);

                    state._fsp--;


                    }
                    break;

            }

            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:700:7: ( K_SUPERUSER | K_NOSUPERUSER )?
            int alt77=3;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==K_SUPERUSER) ) {
                alt77=1;
            }
            else if ( (LA77_0==K_NOSUPERUSER) ) {
                alt77=2;
            }
            switch (alt77) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:700:9: K_SUPERUSER
                    {
                    match(input,K_SUPERUSER,FOLLOW_K_SUPERUSER_in_createUserStatement3801); 
                     superuser = true; 

                    }
                    break;
                case 2 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:700:45: K_NOSUPERUSER
                    {
                    match(input,K_NOSUPERUSER,FOLLOW_K_NOSUPERUSER_in_createUserStatement3807); 
                     superuser = false; 

                    }
                    break;

            }

             stmt = new CreateUserStatement((username10!=null?input.toString(username10.start,username10.stop):null), opts, superuser, ifNotExists); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "createUserStatement"


    // $ANTLR start "alterUserStatement"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:704:1: alterUserStatement returns [AlterUserStatement stmt] : K_ALTER K_USER username ( K_WITH userOptions[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )? ;
    public final AlterUserStatement alterUserStatement() throws RecognitionException {
        AlterUserStatement stmt = null;

        CqlParser.username_return username11 = null;



                UserOptions opts = new UserOptions();
                Boolean superuser = null;
            
        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:712:5: ( K_ALTER K_USER username ( K_WITH userOptions[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )? )
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:712:7: K_ALTER K_USER username ( K_WITH userOptions[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )?
            {
            match(input,K_ALTER,FOLLOW_K_ALTER_in_alterUserStatement3852); 
            match(input,K_USER,FOLLOW_K_USER_in_alterUserStatement3854); 
            pushFollow(FOLLOW_username_in_alterUserStatement3856);
            username11=username();

            state._fsp--;

            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:713:7: ( K_WITH userOptions[opts] )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==K_WITH) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:713:9: K_WITH userOptions[opts]
                    {
                    match(input,K_WITH,FOLLOW_K_WITH_in_alterUserStatement3866); 
                    pushFollow(FOLLOW_userOptions_in_alterUserStatement3868);
                    userOptions(opts);

                    state._fsp--;


                    }
                    break;

            }

            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:714:7: ( K_SUPERUSER | K_NOSUPERUSER )?
            int alt79=3;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==K_SUPERUSER) ) {
                alt79=1;
            }
            else if ( (LA79_0==K_NOSUPERUSER) ) {
                alt79=2;
            }
            switch (alt79) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:714:9: K_SUPERUSER
                    {
                    match(input,K_SUPERUSER,FOLLOW_K_SUPERUSER_in_alterUserStatement3882); 
                     superuser = true; 

                    }
                    break;
                case 2 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:714:45: K_NOSUPERUSER
                    {
                    match(input,K_NOSUPERUSER,FOLLOW_K_NOSUPERUSER_in_alterUserStatement3888); 
                     superuser = false; 

                    }
                    break;

            }

             stmt = new AlterUserStatement((username11!=null?input.toString(username11.start,username11.stop):null), opts, superuser); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "alterUserStatement"


    // $ANTLR start "dropUserStatement"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:718:1: dropUserStatement returns [DropUserStatement stmt] : K_DROP K_USER ( K_IF K_EXISTS )? username ;
    public final DropUserStatement dropUserStatement() throws RecognitionException {
        DropUserStatement stmt = null;

        CqlParser.username_return username12 = null;


         boolean ifExists = false; 
        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:723:5: ( K_DROP K_USER ( K_IF K_EXISTS )? username )
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:723:7: K_DROP K_USER ( K_IF K_EXISTS )? username
            {
            match(input,K_DROP,FOLLOW_K_DROP_in_dropUserStatement3933); 
            match(input,K_USER,FOLLOW_K_USER_in_dropUserStatement3935); 
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:723:21: ( K_IF K_EXISTS )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==K_IF) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:723:22: K_IF K_EXISTS
                    {
                    match(input,K_IF,FOLLOW_K_IF_in_dropUserStatement3938); 
                    match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropUserStatement3940); 
                     ifExists = true; 

                    }
                    break;

            }

            pushFollow(FOLLOW_username_in_dropUserStatement3946);
            username12=username();

            state._fsp--;

             stmt = new DropUserStatement((username12!=null?input.toString(username12.start,username12.stop):null), ifExists); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "dropUserStatement"


    // $ANTLR start "listUsersStatement"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:726:1: listUsersStatement returns [ListUsersStatement stmt] : K_LIST K_USERS ;
    public final ListUsersStatement listUsersStatement() throws RecognitionException {
        ListUsersStatement stmt = null;

        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:730:5: ( K_LIST K_USERS )
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:730:7: K_LIST K_USERS
            {
            match(input,K_LIST,FOLLOW_K_LIST_in_listUsersStatement3971); 
            match(input,K_USERS,FOLLOW_K_USERS_in_listUsersStatement3973); 
             stmt = new ListUsersStatement(); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "listUsersStatement"


    // $ANTLR start "userOptions"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:733:1: userOptions[UserOptions opts] : userOption[opts] ;
    public final void userOptions(UserOptions opts) throws RecognitionException {
        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:734:5: ( userOption[opts] )
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:734:7: userOption[opts]
            {
            pushFollow(FOLLOW_userOption_in_userOptions3993);
            userOption(opts);

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "userOptions"


    // $ANTLR start "userOption"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:737:1: userOption[UserOptions opts] : k= K_PASSWORD v= STRING_LITERAL ;
    public final void userOption(UserOptions opts) throws RecognitionException {
        Token k=null;
        Token v=null;

        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:738:5: (k= K_PASSWORD v= STRING_LITERAL )
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:738:7: k= K_PASSWORD v= STRING_LITERAL
            {
            k=(Token)match(input,K_PASSWORD,FOLLOW_K_PASSWORD_in_userOption4014); 
            v=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_userOption4018); 
             opts.put((k!=null?k.getText():null), (v!=null?v.getText():null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "userOption"


    // $ANTLR start "cident"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:741:1: cident returns [ColumnIdentifier.Raw id] : (t= IDENT | t= QUOTED_NAME | k= unreserved_keyword );
    public final ColumnIdentifier.Raw cident() throws RecognitionException {
        ColumnIdentifier.Raw id = null;

        Token t=null;
        String k = null;


        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:747:5: (t= IDENT | t= QUOTED_NAME | k= unreserved_keyword )
            int alt81=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt81=1;
                }
                break;
            case QUOTED_NAME:
                {
                alt81=2;
                }
                break;
            case K_DISTINCT:
            case K_COUNT:
            case K_AS:
            case K_FILTERING:
            case K_WRITETIME:
            case K_TTL:
            case K_VALUES:
            case K_EXISTS:
            case K_TIMESTAMP:
            case K_COUNTER:
            case K_STATIC:
            case K_KEY:
            case K_COMPACT:
            case K_STORAGE:
            case K_CLUSTERING:
            case K_CUSTOM:
            case K_TRIGGER:
            case K_TYPE:
            case K_LIST:
            case K_ALL:
            case K_PERMISSIONS:
            case K_PERMISSION:
            case K_KEYSPACES:
            case K_USER:
            case K_SUPERUSER:
            case K_NOSUPERUSER:
            case K_USERS:
            case K_PASSWORD:
            case K_ASCII:
            case K_BIGINT:
            case K_BLOB:
            case K_BOOLEAN:
            case K_DECIMAL:
            case K_DOUBLE:
            case K_FLOAT:
            case K_INET:
            case K_INT:
            case K_TEXT:
            case K_UUID:
            case K_VARCHAR:
            case K_VARINT:
            case K_TIMEUUID:
            case K_MAP:
                {
                alt81=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:747:7: t= IDENT
                    {
                    t=(Token)match(input,IDENT,FOLLOW_IDENT_in_cident4049); 
                     id = new ColumnIdentifier.Raw((t!=null?t.getText():null), false); 

                    }
                    break;
                case 2 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:748:7: t= QUOTED_NAME
                    {
                    t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_cident4074); 
                     id = new ColumnIdentifier.Raw((t!=null?t.getText():null), true); 

                    }
                    break;
                case 3 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:749:7: k= unreserved_keyword
                    {
                    pushFollow(FOLLOW_unreserved_keyword_in_cident4093);
                    k=unreserved_keyword();

                    state._fsp--;

                     id = new ColumnIdentifier.Raw(k, false); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return id;
    }
    // $ANTLR end "cident"


    // $ANTLR start "ident"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:753:1: ident returns [ColumnIdentifier id] : (t= IDENT | t= QUOTED_NAME | k= unreserved_keyword );
    public final ColumnIdentifier ident() throws RecognitionException {
        ColumnIdentifier id = null;

        Token t=null;
        String k = null;


        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:754:5: (t= IDENT | t= QUOTED_NAME | k= unreserved_keyword )
            int alt82=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt82=1;
                }
                break;
            case QUOTED_NAME:
                {
                alt82=2;
                }
                break;
            case K_DISTINCT:
            case K_COUNT:
            case K_AS:
            case K_FILTERING:
            case K_WRITETIME:
            case K_TTL:
            case K_VALUES:
            case K_EXISTS:
            case K_TIMESTAMP:
            case K_COUNTER:
            case K_STATIC:
            case K_KEY:
            case K_COMPACT:
            case K_STORAGE:
            case K_CLUSTERING:
            case K_CUSTOM:
            case K_TRIGGER:
            case K_TYPE:
            case K_LIST:
            case K_ALL:
            case K_PERMISSIONS:
            case K_PERMISSION:
            case K_KEYSPACES:
            case K_USER:
            case K_SUPERUSER:
            case K_NOSUPERUSER:
            case K_USERS:
            case K_PASSWORD:
            case K_ASCII:
            case K_BIGINT:
            case K_BLOB:
            case K_BOOLEAN:
            case K_DECIMAL:
            case K_DOUBLE:
            case K_FLOAT:
            case K_INET:
            case K_INT:
            case K_TEXT:
            case K_UUID:
            case K_VARCHAR:
            case K_VARINT:
            case K_TIMEUUID:
            case K_MAP:
                {
                alt82=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:754:7: t= IDENT
                    {
                    t=(Token)match(input,IDENT,FOLLOW_IDENT_in_ident4119); 
                     id = new ColumnIdentifier((t!=null?t.getText():null), false); 

                    }
                    break;
                case 2 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:755:7: t= QUOTED_NAME
                    {
                    t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_ident4144); 
                     id = new ColumnIdentifier((t!=null?t.getText():null), true); 

                    }
                    break;
                case 3 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:756:7: k= unreserved_keyword
                    {
                    pushFollow(FOLLOW_unreserved_keyword_in_ident4163);
                    k=unreserved_keyword();

                    state._fsp--;

                     id = new ColumnIdentifier(k, false); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return id;
    }
    // $ANTLR end "ident"


    // $ANTLR start "keyspaceName"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:760:1: keyspaceName returns [String id] : cfOrKsName[name, true] ;
    public final String keyspaceName() throws RecognitionException {
        String id = null;

         CFName name = new CFName(); 
        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:762:5: ( cfOrKsName[name, true] )
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:762:7: cfOrKsName[name, true]
            {
            pushFollow(FOLLOW_cfOrKsName_in_keyspaceName4196);
            cfOrKsName(name, true);

            state._fsp--;

             id = name.getKeyspace(); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return id;
    }
    // $ANTLR end "keyspaceName"


    // $ANTLR start "columnFamilyName"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:765:1: columnFamilyName returns [CFName name] : ( cfOrKsName[name, true] '.' )? cfOrKsName[name, false] ;
    public final CFName columnFamilyName() throws RecognitionException {
        CFName name = null;

         name = new CFName(); 
        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:767:5: ( ( cfOrKsName[name, true] '.' )? cfOrKsName[name, false] )
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:767:7: ( cfOrKsName[name, true] '.' )? cfOrKsName[name, false]
            {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:767:7: ( cfOrKsName[name, true] '.' )?
            int alt83=2;
            alt83 = dfa83.predict(input);
            switch (alt83) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:767:8: cfOrKsName[name, true] '.'
                    {
                    pushFollow(FOLLOW_cfOrKsName_in_columnFamilyName4230);
                    cfOrKsName(name, true);

                    state._fsp--;

                    match(input,143,FOLLOW_143_in_columnFamilyName4233); 

                    }
                    break;

            }

            pushFollow(FOLLOW_cfOrKsName_in_columnFamilyName4237);
            cfOrKsName(name, false);

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return name;
    }
    // $ANTLR end "columnFamilyName"


    // $ANTLR start "cfOrKsName"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:770:1: cfOrKsName[CFName name, boolean isKs] : (t= IDENT | t= QUOTED_NAME | k= unreserved_keyword | QMARK );
    public final void cfOrKsName(CFName name, boolean isKs) throws RecognitionException {
        Token t=null;
        String k = null;


        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:771:5: (t= IDENT | t= QUOTED_NAME | k= unreserved_keyword | QMARK )
            int alt84=4;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt84=1;
                }
                break;
            case QUOTED_NAME:
                {
                alt84=2;
                }
                break;
            case K_DISTINCT:
            case K_COUNT:
            case K_AS:
            case K_FILTERING:
            case K_WRITETIME:
            case K_TTL:
            case K_VALUES:
            case K_EXISTS:
            case K_TIMESTAMP:
            case K_COUNTER:
            case K_STATIC:
            case K_KEY:
            case K_COMPACT:
            case K_STORAGE:
            case K_CLUSTERING:
            case K_CUSTOM:
            case K_TRIGGER:
            case K_TYPE:
            case K_LIST:
            case K_ALL:
            case K_PERMISSIONS:
            case K_PERMISSION:
            case K_KEYSPACES:
            case K_USER:
            case K_SUPERUSER:
            case K_NOSUPERUSER:
            case K_USERS:
            case K_PASSWORD:
            case K_ASCII:
            case K_BIGINT:
            case K_BLOB:
            case K_BOOLEAN:
            case K_DECIMAL:
            case K_DOUBLE:
            case K_FLOAT:
            case K_INET:
            case K_INT:
            case K_TEXT:
            case K_UUID:
            case K_VARCHAR:
            case K_VARINT:
            case K_TIMEUUID:
            case K_MAP:
                {
                alt84=3;
                }
                break;
            case QMARK:
                {
                alt84=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }

            switch (alt84) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:771:7: t= IDENT
                    {
                    t=(Token)match(input,IDENT,FOLLOW_IDENT_in_cfOrKsName4258); 
                     if (isKs) name.setKeyspace((t!=null?t.getText():null), false); else name.setColumnFamily((t!=null?t.getText():null), false); 

                    }
                    break;
                case 2 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:772:7: t= QUOTED_NAME
                    {
                    t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_cfOrKsName4283); 
                     if (isKs) name.setKeyspace((t!=null?t.getText():null), true); else name.setColumnFamily((t!=null?t.getText():null), true); 

                    }
                    break;
                case 3 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:773:7: k= unreserved_keyword
                    {
                    pushFollow(FOLLOW_unreserved_keyword_in_cfOrKsName4302);
                    k=unreserved_keyword();

                    state._fsp--;

                     if (isKs) name.setKeyspace(k, false); else name.setColumnFamily(k, false); 

                    }
                    break;
                case 4 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:774:7: QMARK
                    {
                    match(input,QMARK,FOLLOW_QMARK_in_cfOrKsName4312); 
                    addRecognitionError("Bind variables cannot be used for keyspace or table names");

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "cfOrKsName"


    // $ANTLR start "constant"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:777:1: constant returns [Constants.Literal constant] : (t= STRING_LITERAL | t= INTEGER | t= FLOAT | t= BOOLEAN | t= UUID | t= HEXNUMBER | ( '-' )? t= ( K_NAN | K_INFINITY ) );
    public final Constants.Literal constant() throws RecognitionException {
        Constants.Literal constant = null;

        Token t=null;

        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:778:5: (t= STRING_LITERAL | t= INTEGER | t= FLOAT | t= BOOLEAN | t= UUID | t= HEXNUMBER | ( '-' )? t= ( K_NAN | K_INFINITY ) )
            int alt86=7;
            switch ( input.LA(1) ) {
            case STRING_LITERAL:
                {
                alt86=1;
                }
                break;
            case INTEGER:
                {
                alt86=2;
                }
                break;
            case FLOAT:
                {
                alt86=3;
                }
                break;
            case BOOLEAN:
                {
                alt86=4;
                }
                break;
            case UUID:
                {
                alt86=5;
                }
                break;
            case HEXNUMBER:
                {
                alt86=6;
                }
                break;
            case K_NAN:
            case K_INFINITY:
            case 144:
                {
                alt86=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }

            switch (alt86) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:778:7: t= STRING_LITERAL
                    {
                    t=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_constant4337); 
                     constant = Constants.Literal.string((t!=null?t.getText():null)); 

                    }
                    break;
                case 2 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:779:7: t= INTEGER
                    {
                    t=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_constant4349); 
                     constant = Constants.Literal.integer((t!=null?t.getText():null)); 

                    }
                    break;
                case 3 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:780:7: t= FLOAT
                    {
                    t=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_constant4368); 
                     constant = Constants.Literal.floatingPoint((t!=null?t.getText():null)); 

                    }
                    break;
                case 4 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:781:7: t= BOOLEAN
                    {
                    t=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_constant4389); 
                     constant = Constants.Literal.bool((t!=null?t.getText():null)); 

                    }
                    break;
                case 5 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:782:7: t= UUID
                    {
                    t=(Token)match(input,UUID,FOLLOW_UUID_in_constant4408); 
                     constant = Constants.Literal.uuid((t!=null?t.getText():null)); 

                    }
                    break;
                case 6 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:783:7: t= HEXNUMBER
                    {
                    t=(Token)match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_constant4430); 
                     constant = Constants.Literal.hex((t!=null?t.getText():null)); 

                    }
                    break;
                case 7 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:784:7: ( '-' )? t= ( K_NAN | K_INFINITY )
                    {
                     String sign=""; 
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:784:27: ( '-' )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==144) ) {
                        alt85=1;
                    }
                    switch (alt85) {
                        case 1 :
                            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:784:28: '-'
                            {
                            match(input,144,FOLLOW_144_in_constant4448); 
                            sign = "-"; 

                            }
                            break;

                    }

                    t=(Token)input.LT(1);
                    if ( (input.LA(1)>=K_NAN && input.LA(1)<=K_INFINITY) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                     constant = Constants.Literal.floatingPoint(sign + (t!=null?t.getText():null)); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return constant;
    }
    // $ANTLR end "constant"


    // $ANTLR start "map_literal"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:787:1: map_literal returns [Maps.Literal map] : '{' (k1= term ':' v1= term ( ',' kn= term ':' vn= term )* )? '}' ;
    public final Maps.Literal map_literal() throws RecognitionException {
        Maps.Literal map = null;

        Term.Raw k1 = null;

        Term.Raw v1 = null;

        Term.Raw kn = null;

        Term.Raw vn = null;


        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:788:5: ( '{' (k1= term ':' v1= term ( ',' kn= term ':' vn= term )* )? '}' )
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:788:7: '{' (k1= term ':' v1= term ( ',' kn= term ':' vn= term )* )? '}'
            {
            match(input,145,FOLLOW_145_in_map_literal4486); 
             List<Pair<Term.Raw, Term.Raw>> m = new ArrayList<Pair<Term.Raw, Term.Raw>>(); 
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:789:11: (k1= term ':' v1= term ( ',' kn= term ':' vn= term )* )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==K_DISTINCT||LA88_0==K_AS||LA88_0==K_FILTERING||LA88_0==INTEGER||LA88_0==K_VALUES||LA88_0==K_EXISTS||LA88_0==K_TIMESTAMP||LA88_0==K_COUNTER||LA88_0==K_STATIC||(LA88_0>=K_KEY && LA88_0<=K_CUSTOM)||LA88_0==IDENT||(LA88_0>=STRING_LITERAL && LA88_0<=K_TRIGGER)||LA88_0==K_TYPE||LA88_0==K_LIST||(LA88_0>=K_ALL && LA88_0<=K_PASSWORD)||(LA88_0>=QMARK && LA88_0<=K_TOKEN)||(LA88_0>=K_ASCII && LA88_0<=K_MAP)||LA88_0==137||LA88_0==141||(LA88_0>=144 && LA88_0<=146)) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:789:13: k1= term ':' v1= term ( ',' kn= term ':' vn= term )*
                    {
                    pushFollow(FOLLOW_term_in_map_literal4504);
                    k1=term();

                    state._fsp--;

                    match(input,146,FOLLOW_146_in_map_literal4506); 
                    pushFollow(FOLLOW_term_in_map_literal4510);
                    v1=term();

                    state._fsp--;

                     m.add(Pair.create(k1, v1)); 
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:789:65: ( ',' kn= term ':' vn= term )*
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==139) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:789:67: ',' kn= term ':' vn= term
                    	    {
                    	    match(input,139,FOLLOW_139_in_map_literal4516); 
                    	    pushFollow(FOLLOW_term_in_map_literal4520);
                    	    kn=term();

                    	    state._fsp--;

                    	    match(input,146,FOLLOW_146_in_map_literal4522); 
                    	    pushFollow(FOLLOW_term_in_map_literal4526);
                    	    vn=term();

                    	    state._fsp--;

                    	     m.add(Pair.create(kn, vn)); 

                    	    }
                    	    break;

                    	default :
                    	    break loop87;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,147,FOLLOW_147_in_map_literal4542); 
             map = new Maps.Literal(m); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return map;
    }
    // $ANTLR end "map_literal"


    // $ANTLR start "set_or_map"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:793:1: set_or_map[Term.Raw t] returns [Term.Raw value] : ( ':' v= term ( ',' kn= term ':' vn= term )* | ( ',' tn= term )* );
    public final Term.Raw set_or_map(Term.Raw t) throws RecognitionException {
        Term.Raw value = null;

        Term.Raw v = null;

        Term.Raw kn = null;

        Term.Raw vn = null;

        Term.Raw tn = null;


        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:794:5: ( ':' v= term ( ',' kn= term ':' vn= term )* | ( ',' tn= term )* )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==146) ) {
                alt91=1;
            }
            else if ( (LA91_0==139||LA91_0==147) ) {
                alt91=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:794:7: ':' v= term ( ',' kn= term ':' vn= term )*
                    {
                    match(input,146,FOLLOW_146_in_set_or_map4566); 
                    pushFollow(FOLLOW_term_in_set_or_map4570);
                    v=term();

                    state._fsp--;

                     List<Pair<Term.Raw, Term.Raw>> m = new ArrayList<Pair<Term.Raw, Term.Raw>>(); m.add(Pair.create(t, v)); 
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:795:11: ( ',' kn= term ':' vn= term )*
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==139) ) {
                            alt89=1;
                        }


                        switch (alt89) {
                    	case 1 :
                    	    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:795:13: ',' kn= term ':' vn= term
                    	    {
                    	    match(input,139,FOLLOW_139_in_set_or_map4586); 
                    	    pushFollow(FOLLOW_term_in_set_or_map4590);
                    	    kn=term();

                    	    state._fsp--;

                    	    match(input,146,FOLLOW_146_in_set_or_map4592); 
                    	    pushFollow(FOLLOW_term_in_set_or_map4596);
                    	    vn=term();

                    	    state._fsp--;

                    	     m.add(Pair.create(kn, vn)); 

                    	    }
                    	    break;

                    	default :
                    	    break loop89;
                        }
                    } while (true);

                     value = new Maps.Literal(m); 

                    }
                    break;
                case 2 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:797:7: ( ',' tn= term )*
                    {
                     List<Term.Raw> s = new ArrayList<Term.Raw>(); s.add(t); 
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:798:11: ( ',' tn= term )*
                    loop90:
                    do {
                        int alt90=2;
                        int LA90_0 = input.LA(1);

                        if ( (LA90_0==139) ) {
                            alt90=1;
                        }


                        switch (alt90) {
                    	case 1 :
                    	    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:798:13: ',' tn= term
                    	    {
                    	    match(input,139,FOLLOW_139_in_set_or_map4631); 
                    	    pushFollow(FOLLOW_term_in_set_or_map4635);
                    	    tn=term();

                    	    state._fsp--;

                    	     s.add(tn); 

                    	    }
                    	    break;

                    	default :
                    	    break loop90;
                        }
                    } while (true);

                     value = new Sets.Literal(s); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "set_or_map"


    // $ANTLR start "collection_literal"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:802:1: collection_literal returns [Term.Raw value] : ( '[' (t1= term ( ',' tn= term )* )? ']' | '{' t= term v= set_or_map[t] '}' | '{' '}' );
    public final Term.Raw collection_literal() throws RecognitionException {
        Term.Raw value = null;

        Term.Raw t1 = null;

        Term.Raw tn = null;

        Term.Raw t = null;

        Term.Raw v = null;


        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:803:5: ( '[' (t1= term ( ',' tn= term )* )? ']' | '{' t= term v= set_or_map[t] '}' | '{' '}' )
            int alt94=3;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==141) ) {
                alt94=1;
            }
            else if ( (LA94_0==145) ) {
                int LA94_2 = input.LA(2);

                if ( (LA94_2==147) ) {
                    alt94=3;
                }
                else if ( (LA94_2==K_DISTINCT||LA94_2==K_AS||LA94_2==K_FILTERING||LA94_2==INTEGER||LA94_2==K_VALUES||LA94_2==K_EXISTS||LA94_2==K_TIMESTAMP||LA94_2==K_COUNTER||LA94_2==K_STATIC||(LA94_2>=K_KEY && LA94_2<=K_CUSTOM)||LA94_2==IDENT||(LA94_2>=STRING_LITERAL && LA94_2<=K_TRIGGER)||LA94_2==K_TYPE||LA94_2==K_LIST||(LA94_2>=K_ALL && LA94_2<=K_PASSWORD)||(LA94_2>=QMARK && LA94_2<=K_TOKEN)||(LA94_2>=K_ASCII && LA94_2<=K_MAP)||LA94_2==137||LA94_2==141||(LA94_2>=144 && LA94_2<=146)) ) {
                    alt94=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 94, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }
            switch (alt94) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:803:7: '[' (t1= term ( ',' tn= term )* )? ']'
                    {
                    match(input,141,FOLLOW_141_in_collection_literal4669); 
                     List<Term.Raw> l = new ArrayList<Term.Raw>(); 
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:804:11: (t1= term ( ',' tn= term )* )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==K_DISTINCT||LA93_0==K_AS||LA93_0==K_FILTERING||LA93_0==INTEGER||LA93_0==K_VALUES||LA93_0==K_EXISTS||LA93_0==K_TIMESTAMP||LA93_0==K_COUNTER||LA93_0==K_STATIC||(LA93_0>=K_KEY && LA93_0<=K_CUSTOM)||LA93_0==IDENT||(LA93_0>=STRING_LITERAL && LA93_0<=K_TRIGGER)||LA93_0==K_TYPE||LA93_0==K_LIST||(LA93_0>=K_ALL && LA93_0<=K_PASSWORD)||(LA93_0>=QMARK && LA93_0<=K_TOKEN)||(LA93_0>=K_ASCII && LA93_0<=K_MAP)||LA93_0==137||LA93_0==141||(LA93_0>=144 && LA93_0<=146)) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:804:13: t1= term ( ',' tn= term )*
                            {
                            pushFollow(FOLLOW_term_in_collection_literal4687);
                            t1=term();

                            state._fsp--;

                             l.add(t1); 
                            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:804:36: ( ',' tn= term )*
                            loop92:
                            do {
                                int alt92=2;
                                int LA92_0 = input.LA(1);

                                if ( (LA92_0==139) ) {
                                    alt92=1;
                                }


                                switch (alt92) {
                            	case 1 :
                            	    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:804:38: ',' tn= term
                            	    {
                            	    match(input,139,FOLLOW_139_in_collection_literal4693); 
                            	    pushFollow(FOLLOW_term_in_collection_literal4697);
                            	    tn=term();

                            	    state._fsp--;

                            	     l.add(tn); 

                            	    }
                            	    break;

                            	default :
                            	    break loop92;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,142,FOLLOW_142_in_collection_literal4713); 
                     value = new Lists.Literal(l); 

                    }
                    break;
                case 2 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:806:7: '{' t= term v= set_or_map[t] '}'
                    {
                    match(input,145,FOLLOW_145_in_collection_literal4723); 
                    pushFollow(FOLLOW_term_in_collection_literal4727);
                    t=term();

                    state._fsp--;

                    pushFollow(FOLLOW_set_or_map_in_collection_literal4731);
                    v=set_or_map(t);

                    state._fsp--;

                     value = v; 
                    match(input,147,FOLLOW_147_in_collection_literal4736); 

                    }
                    break;
                case 3 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:809:7: '{' '}'
                    {
                    match(input,145,FOLLOW_145_in_collection_literal4754); 
                    match(input,147,FOLLOW_147_in_collection_literal4756); 
                     value = new Sets.Literal(Collections.<Term.Raw>emptyList()); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "collection_literal"


    // $ANTLR start "value"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:812:1: value returns [Term.Raw value] : (c= constant | l= collection_literal | K_NULL | ':' id= ident | QMARK );
    public final Term.Raw value() throws RecognitionException {
        Term.Raw value = null;

        Constants.Literal c = null;

        Term.Raw l = null;

        ColumnIdentifier id = null;


        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:813:5: (c= constant | l= collection_literal | K_NULL | ':' id= ident | QMARK )
            int alt95=5;
            switch ( input.LA(1) ) {
            case INTEGER:
            case STRING_LITERAL:
            case FLOAT:
            case BOOLEAN:
            case UUID:
            case HEXNUMBER:
            case K_NAN:
            case K_INFINITY:
            case 144:
                {
                alt95=1;
                }
                break;
            case 141:
            case 145:
                {
                alt95=2;
                }
                break;
            case K_NULL:
                {
                alt95=3;
                }
                break;
            case 146:
                {
                alt95=4;
                }
                break;
            case QMARK:
                {
                alt95=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }

            switch (alt95) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:813:7: c= constant
                    {
                    pushFollow(FOLLOW_constant_in_value4781);
                    c=constant();

                    state._fsp--;

                     value = c; 

                    }
                    break;
                case 2 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:814:7: l= collection_literal
                    {
                    pushFollow(FOLLOW_collection_literal_in_value4803);
                    l=collection_literal();

                    state._fsp--;

                     value = l; 

                    }
                    break;
                case 3 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:815:7: K_NULL
                    {
                    match(input,K_NULL,FOLLOW_K_NULL_in_value4813); 
                     value = Constants.NULL_LITERAL; 

                    }
                    break;
                case 4 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:816:7: ':' id= ident
                    {
                    match(input,146,FOLLOW_146_in_value4837); 
                    pushFollow(FOLLOW_ident_in_value4841);
                    id=ident();

                    state._fsp--;

                     value = newBindVariables(id); 

                    }
                    break;
                case 5 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:817:7: QMARK
                    {
                    match(input,QMARK,FOLLOW_QMARK_in_value4859); 
                     value = newBindVariables(null); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "value"


    // $ANTLR start "intValue"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:820:1: intValue returns [Term.Raw value] : ( | t= INTEGER | ':' id= ident | QMARK );
    public final Term.Raw intValue() throws RecognitionException {
        Term.Raw value = null;

        Token t=null;
        ColumnIdentifier id = null;


        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:821:5: ( | t= INTEGER | ':' id= ident | QMARK )
            int alt96=4;
            switch ( input.LA(1) ) {
            case EOF:
            case K_WHERE:
            case K_ALLOW:
            case K_AND:
            case K_INSERT:
            case K_UPDATE:
            case K_SET:
            case K_DELETE:
            case K_APPLY:
            case 136:
                {
                alt96=1;
                }
                break;
            case INTEGER:
                {
                alt96=2;
                }
                break;
            case 146:
                {
                alt96=3;
                }
                break;
            case QMARK:
                {
                alt96=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }

            switch (alt96) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:822:5: 
                    {
                    }
                    break;
                case 2 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:822:7: t= INTEGER
                    {
                    t=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_intValue4905); 
                     value = Constants.Literal.integer((t!=null?t.getText():null)); 

                    }
                    break;
                case 3 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:823:7: ':' id= ident
                    {
                    match(input,146,FOLLOW_146_in_intValue4919); 
                    pushFollow(FOLLOW_ident_in_intValue4923);
                    id=ident();

                    state._fsp--;

                     value = newBindVariables(id); 

                    }
                    break;
                case 4 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:824:7: QMARK
                    {
                    match(input,QMARK,FOLLOW_QMARK_in_intValue4934); 
                     value = newBindVariables(null); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "intValue"


    // $ANTLR start "functionName"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:827:1: functionName returns [String s] : (f= IDENT | u= unreserved_function_keyword | K_TOKEN );
    public final String functionName() throws RecognitionException {
        String s = null;

        Token f=null;
        String u = null;


        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:828:5: (f= IDENT | u= unreserved_function_keyword | K_TOKEN )
            int alt97=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt97=1;
                }
                break;
            case K_DISTINCT:
            case K_AS:
            case K_FILTERING:
            case K_VALUES:
            case K_EXISTS:
            case K_TIMESTAMP:
            case K_COUNTER:
            case K_STATIC:
            case K_KEY:
            case K_COMPACT:
            case K_STORAGE:
            case K_CLUSTERING:
            case K_CUSTOM:
            case K_TRIGGER:
            case K_TYPE:
            case K_LIST:
            case K_ALL:
            case K_PERMISSIONS:
            case K_PERMISSION:
            case K_KEYSPACES:
            case K_USER:
            case K_SUPERUSER:
            case K_NOSUPERUSER:
            case K_USERS:
            case K_PASSWORD:
            case K_ASCII:
            case K_BIGINT:
            case K_BLOB:
            case K_BOOLEAN:
            case K_DECIMAL:
            case K_DOUBLE:
            case K_FLOAT:
            case K_INET:
            case K_INT:
            case K_TEXT:
            case K_UUID:
            case K_VARCHAR:
            case K_VARINT:
            case K_TIMEUUID:
            case K_MAP:
                {
                alt97=2;
                }
                break;
            case K_TOKEN:
                {
                alt97=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }

            switch (alt97) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:828:7: f= IDENT
                    {
                    f=(Token)match(input,IDENT,FOLLOW_IDENT_in_functionName4967); 
                     s = (f!=null?f.getText():null); 

                    }
                    break;
                case 2 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:829:7: u= unreserved_function_keyword
                    {
                    pushFollow(FOLLOW_unreserved_function_keyword_in_functionName5001);
                    u=unreserved_function_keyword();

                    state._fsp--;

                     s = u; 

                    }
                    break;
                case 3 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:830:7: K_TOKEN
                    {
                    match(input,K_TOKEN,FOLLOW_K_TOKEN_in_functionName5011); 
                     s = "token"; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return s;
    }
    // $ANTLR end "functionName"


    // $ANTLR start "functionArgs"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:833:1: functionArgs returns [List<Term.Raw> a] : ( '(' ')' | '(' t1= term ( ',' tn= term )* ')' );
    public final List<Term.Raw> functionArgs() throws RecognitionException {
        List<Term.Raw> a = null;

        Term.Raw t1 = null;

        Term.Raw tn = null;


        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:834:5: ( '(' ')' | '(' t1= term ( ',' tn= term )* ')' )
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==137) ) {
                int LA99_1 = input.LA(2);

                if ( (LA99_1==138) ) {
                    alt99=1;
                }
                else if ( (LA99_1==K_DISTINCT||LA99_1==K_AS||LA99_1==K_FILTERING||LA99_1==INTEGER||LA99_1==K_VALUES||LA99_1==K_EXISTS||LA99_1==K_TIMESTAMP||LA99_1==K_COUNTER||LA99_1==K_STATIC||(LA99_1>=K_KEY && LA99_1<=K_CUSTOM)||LA99_1==IDENT||(LA99_1>=STRING_LITERAL && LA99_1<=K_TRIGGER)||LA99_1==K_TYPE||LA99_1==K_LIST||(LA99_1>=K_ALL && LA99_1<=K_PASSWORD)||(LA99_1>=QMARK && LA99_1<=K_TOKEN)||(LA99_1>=K_ASCII && LA99_1<=K_MAP)||LA99_1==137||LA99_1==141||(LA99_1>=144 && LA99_1<=146)) ) {
                    alt99=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 99, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }
            switch (alt99) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:834:7: '(' ')'
                    {
                    match(input,137,FOLLOW_137_in_functionArgs5056); 
                    match(input,138,FOLLOW_138_in_functionArgs5058); 
                     a = Collections.emptyList(); 

                    }
                    break;
                case 2 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:835:7: '(' t1= term ( ',' tn= term )* ')'
                    {
                    match(input,137,FOLLOW_137_in_functionArgs5068); 
                    pushFollow(FOLLOW_term_in_functionArgs5072);
                    t1=term();

                    state._fsp--;

                     List<Term.Raw> args = new ArrayList<Term.Raw>(); args.add(t1); 
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:836:11: ( ',' tn= term )*
                    loop98:
                    do {
                        int alt98=2;
                        int LA98_0 = input.LA(1);

                        if ( (LA98_0==139) ) {
                            alt98=1;
                        }


                        switch (alt98) {
                    	case 1 :
                    	    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:836:13: ',' tn= term
                    	    {
                    	    match(input,139,FOLLOW_139_in_functionArgs5088); 
                    	    pushFollow(FOLLOW_term_in_functionArgs5092);
                    	    tn=term();

                    	    state._fsp--;

                    	     args.add(tn); 

                    	    }
                    	    break;

                    	default :
                    	    break loop98;
                        }
                    } while (true);

                    match(input,138,FOLLOW_138_in_functionArgs5106); 
                     a = args; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return a;
    }
    // $ANTLR end "functionArgs"


    // $ANTLR start "term"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:840:1: term returns [Term.Raw term] : (v= value | f= functionName args= functionArgs | '(' c= comparatorType ')' t= term );
    public final Term.Raw term() throws RecognitionException {
        Term.Raw term = null;

        Term.Raw v = null;

        String f = null;

        List<Term.Raw> args = null;

        CQL3Type c = null;

        Term.Raw t = null;


        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:841:5: (v= value | f= functionName args= functionArgs | '(' c= comparatorType ')' t= term )
            int alt100=3;
            switch ( input.LA(1) ) {
            case INTEGER:
            case STRING_LITERAL:
            case QMARK:
            case FLOAT:
            case BOOLEAN:
            case UUID:
            case HEXNUMBER:
            case K_NAN:
            case K_INFINITY:
            case K_NULL:
            case 141:
            case 144:
            case 145:
            case 146:
                {
                alt100=1;
                }
                break;
            case K_DISTINCT:
            case K_AS:
            case K_FILTERING:
            case K_VALUES:
            case K_EXISTS:
            case K_TIMESTAMP:
            case K_COUNTER:
            case K_STATIC:
            case K_KEY:
            case K_COMPACT:
            case K_STORAGE:
            case K_CLUSTERING:
            case K_CUSTOM:
            case IDENT:
            case K_TRIGGER:
            case K_TYPE:
            case K_LIST:
            case K_ALL:
            case K_PERMISSIONS:
            case K_PERMISSION:
            case K_KEYSPACES:
            case K_USER:
            case K_SUPERUSER:
            case K_NOSUPERUSER:
            case K_USERS:
            case K_PASSWORD:
            case K_TOKEN:
            case K_ASCII:
            case K_BIGINT:
            case K_BLOB:
            case K_BOOLEAN:
            case K_DECIMAL:
            case K_DOUBLE:
            case K_FLOAT:
            case K_INET:
            case K_INT:
            case K_TEXT:
            case K_UUID:
            case K_VARCHAR:
            case K_VARINT:
            case K_TIMEUUID:
            case K_MAP:
                {
                alt100=2;
                }
                break;
            case 137:
                {
                alt100=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }

            switch (alt100) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:841:7: v= value
                    {
                    pushFollow(FOLLOW_value_in_term5131);
                    v=value();

                    state._fsp--;

                     term = v; 

                    }
                    break;
                case 2 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:842:7: f= functionName args= functionArgs
                    {
                    pushFollow(FOLLOW_functionName_in_term5168);
                    f=functionName();

                    state._fsp--;

                    pushFollow(FOLLOW_functionArgs_in_term5172);
                    args=functionArgs();

                    state._fsp--;

                     term = new FunctionCall.Raw(f, args); 

                    }
                    break;
                case 3 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:843:7: '(' c= comparatorType ')' t= term
                    {
                    match(input,137,FOLLOW_137_in_term5182); 
                    pushFollow(FOLLOW_comparatorType_in_term5186);
                    c=comparatorType();

                    state._fsp--;

                    match(input,138,FOLLOW_138_in_term5188); 
                    pushFollow(FOLLOW_term_in_term5192);
                    t=term();

                    state._fsp--;

                     term = new TypeCast(c, t); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return term;
    }
    // $ANTLR end "term"


    // $ANTLR start "columnOperation"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:846:1: columnOperation[List<Pair<ColumnIdentifier.Raw, Operation.RawUpdate>> operations] : (key= cident '=' t= term ( '+' c= cident )? | key= cident '=' c= cident sig= ( '+' | '-' ) t= term | key= cident '=' c= cident i= INTEGER | key= cident '[' k= term ']' '=' t= term );
    public final void columnOperation(List<Pair<ColumnIdentifier.Raw, Operation.RawUpdate>> operations) throws RecognitionException {
        Token sig=null;
        Token i=null;
        ColumnIdentifier.Raw key = null;

        Term.Raw t = null;

        ColumnIdentifier.Raw c = null;

        Term.Raw k = null;


        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:847:5: (key= cident '=' t= term ( '+' c= cident )? | key= cident '=' c= cident sig= ( '+' | '-' ) t= term | key= cident '=' c= cident i= INTEGER | key= cident '[' k= term ']' '=' t= term )
            int alt102=4;
            alt102 = dfa102.predict(input);
            switch (alt102) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:847:7: key= cident '=' t= term ( '+' c= cident )?
                    {
                    pushFollow(FOLLOW_cident_in_columnOperation5215);
                    key=cident();

                    state._fsp--;

                    match(input,148,FOLLOW_148_in_columnOperation5217); 
                    pushFollow(FOLLOW_term_in_columnOperation5221);
                    t=term();

                    state._fsp--;

                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:847:29: ( '+' c= cident )?
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==149) ) {
                        alt101=1;
                    }
                    switch (alt101) {
                        case 1 :
                            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:847:30: '+' c= cident
                            {
                            match(input,149,FOLLOW_149_in_columnOperation5224); 
                            pushFollow(FOLLOW_cident_in_columnOperation5228);
                            c=cident();

                            state._fsp--;


                            }
                            break;

                    }


                              if (c == null)
                              {
                                  addRawUpdate(operations, key, new Operation.SetValue(t));
                              }
                              else
                              {
                                  if (!key.equals(c))
                                      addRecognitionError("Only expressions of the form X = <value> + X are supported.");
                                  addRawUpdate(operations, key, new Operation.Prepend(t));
                              }
                          

                    }
                    break;
                case 2 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:860:7: key= cident '=' c= cident sig= ( '+' | '-' ) t= term
                    {
                    pushFollow(FOLLOW_cident_in_columnOperation5249);
                    key=cident();

                    state._fsp--;

                    match(input,148,FOLLOW_148_in_columnOperation5251); 
                    pushFollow(FOLLOW_cident_in_columnOperation5255);
                    c=cident();

                    state._fsp--;

                    sig=(Token)input.LT(1);
                    if ( input.LA(1)==144||input.LA(1)==149 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_term_in_columnOperation5269);
                    t=term();

                    state._fsp--;


                              if (!key.equals(c))
                                  addRecognitionError("Only expressions of the form X = X " + (sig!=null?sig.getText():null) + "<value> are supported.");
                              addRawUpdate(operations, key, (sig!=null?sig.getText():null).equals("+") ? new Operation.Addition(t) : new Operation.Substraction(t));
                          

                    }
                    break;
                case 3 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:866:7: key= cident '=' c= cident i= INTEGER
                    {
                    pushFollow(FOLLOW_cident_in_columnOperation5287);
                    key=cident();

                    state._fsp--;

                    match(input,148,FOLLOW_148_in_columnOperation5289); 
                    pushFollow(FOLLOW_cident_in_columnOperation5293);
                    c=cident();

                    state._fsp--;

                    i=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_columnOperation5297); 

                              // Note that this production *is* necessary because X = X - 3 will in fact be lexed as [ X, '=', X, INTEGER].
                              if (!key.equals(c))
                                  // We don't yet allow a '+' in front of an integer, but we could in the future really, so let's be future-proof in our error message
                                  addRecognitionError("Only expressions of the form X = X " + ((i!=null?i.getText():null).charAt(0) == '-' ? '-' : '+') + " <value> are supported.");
                              addRawUpdate(operations, key, new Operation.Addition(Constants.Literal.integer((i!=null?i.getText():null))));
                          

                    }
                    break;
                case 4 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:874:7: key= cident '[' k= term ']' '=' t= term
                    {
                    pushFollow(FOLLOW_cident_in_columnOperation5315);
                    key=cident();

                    state._fsp--;

                    match(input,141,FOLLOW_141_in_columnOperation5317); 
                    pushFollow(FOLLOW_term_in_columnOperation5321);
                    k=term();

                    state._fsp--;

                    match(input,142,FOLLOW_142_in_columnOperation5323); 
                    match(input,148,FOLLOW_148_in_columnOperation5325); 
                    pushFollow(FOLLOW_term_in_columnOperation5329);
                    t=term();

                    state._fsp--;


                              addRawUpdate(operations, key, new Operation.SetElement(k, t));
                          

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "columnOperation"


    // $ANTLR start "columnCondition"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:880:1: columnCondition[List<Pair<ColumnIdentifier.Raw, ColumnCondition.Raw>> conditions] : (key= cident '=' t= term | key= cident '[' element= term ']' '=' t= term );
    public final void columnCondition(List<Pair<ColumnIdentifier.Raw, ColumnCondition.Raw>> conditions) throws RecognitionException {
        ColumnIdentifier.Raw key = null;

        Term.Raw t = null;

        Term.Raw element = null;


        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:882:5: (key= cident '=' t= term | key= cident '[' element= term ']' '=' t= term )
            int alt103=2;
            alt103 = dfa103.predict(input);
            switch (alt103) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:882:7: key= cident '=' t= term
                    {
                    pushFollow(FOLLOW_cident_in_columnCondition5362);
                    key=cident();

                    state._fsp--;

                    match(input,148,FOLLOW_148_in_columnCondition5364); 
                    pushFollow(FOLLOW_term_in_columnCondition5368);
                    t=term();

                    state._fsp--;

                     conditions.add(Pair.create(key, ColumnCondition.Raw.simpleEqual(t))); 

                    }
                    break;
                case 2 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:883:7: key= cident '[' element= term ']' '=' t= term
                    {
                    pushFollow(FOLLOW_cident_in_columnCondition5380);
                    key=cident();

                    state._fsp--;

                    match(input,141,FOLLOW_141_in_columnCondition5382); 
                    pushFollow(FOLLOW_term_in_columnCondition5386);
                    element=term();

                    state._fsp--;

                    match(input,142,FOLLOW_142_in_columnCondition5388); 
                    match(input,148,FOLLOW_148_in_columnCondition5390); 
                    pushFollow(FOLLOW_term_in_columnCondition5394);
                    t=term();

                    state._fsp--;

                     conditions.add(Pair.create(key, ColumnCondition.Raw.collectionEqual(t, element))); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "columnCondition"


    // $ANTLR start "properties"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:886:1: properties[PropertyDefinitions props] : property[props] ( K_AND property[props] )* ;
    public final void properties(PropertyDefinitions props) throws RecognitionException {
        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:887:5: ( property[props] ( K_AND property[props] )* )
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:887:7: property[props] ( K_AND property[props] )*
            {
            pushFollow(FOLLOW_property_in_properties5415);
            property(props);

            state._fsp--;

            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:887:23: ( K_AND property[props] )*
            loop104:
            do {
                int alt104=2;
                int LA104_0 = input.LA(1);

                if ( (LA104_0==K_AND) ) {
                    alt104=1;
                }


                switch (alt104) {
            	case 1 :
            	    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:887:24: K_AND property[props]
            	    {
            	    match(input,K_AND,FOLLOW_K_AND_in_properties5419); 
            	    pushFollow(FOLLOW_property_in_properties5421);
            	    property(props);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop104;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "properties"


    // $ANTLR start "property"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:890:1: property[PropertyDefinitions props] : k= ident '=' (simple= propertyValue | map= map_literal ) ;
    public final void property(PropertyDefinitions props) throws RecognitionException {
        ColumnIdentifier k = null;

        String simple = null;

        Maps.Literal map = null;


        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:891:5: (k= ident '=' (simple= propertyValue | map= map_literal ) )
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:891:7: k= ident '=' (simple= propertyValue | map= map_literal )
            {
            pushFollow(FOLLOW_ident_in_property5444);
            k=ident();

            state._fsp--;

            match(input,148,FOLLOW_148_in_property5446); 
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:891:19: (simple= propertyValue | map= map_literal )
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( ((LA105_0>=K_DISTINCT && LA105_0<=K_AS)||(LA105_0>=K_FILTERING && LA105_0<=INTEGER)||LA105_0==K_VALUES||LA105_0==K_EXISTS||LA105_0==K_TIMESTAMP||LA105_0==K_COUNTER||LA105_0==K_STATIC||(LA105_0>=K_KEY && LA105_0<=K_CUSTOM)||(LA105_0>=STRING_LITERAL && LA105_0<=K_TRIGGER)||LA105_0==K_TYPE||LA105_0==K_LIST||(LA105_0>=K_ALL && LA105_0<=K_PASSWORD)||(LA105_0>=FLOAT && LA105_0<=K_INFINITY)||(LA105_0>=K_ASCII && LA105_0<=K_MAP)||LA105_0==144) ) {
                alt105=1;
            }
            else if ( (LA105_0==145) ) {
                alt105=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;
            }
            switch (alt105) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:891:20: simple= propertyValue
                    {
                    pushFollow(FOLLOW_propertyValue_in_property5451);
                    simple=propertyValue();

                    state._fsp--;

                     try { props.addProperty(k.toString(), simple); } catch (SyntaxException e) { addRecognitionError(e.getMessage()); } 

                    }
                    break;
                case 2 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:892:24: map= map_literal
                    {
                    pushFollow(FOLLOW_map_literal_in_property5480);
                    map=map_literal();

                    state._fsp--;

                     try { props.addProperty(k.toString(), convertPropertyMap(map)); } catch (SyntaxException e) { addRecognitionError(e.getMessage()); } 

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "property"


    // $ANTLR start "propertyValue"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:895:1: propertyValue returns [String str] : (c= constant | u= unreserved_keyword );
    public final String propertyValue() throws RecognitionException {
        String str = null;

        Constants.Literal c = null;

        String u = null;


        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:896:5: (c= constant | u= unreserved_keyword )
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==INTEGER||LA106_0==STRING_LITERAL||(LA106_0>=FLOAT && LA106_0<=K_INFINITY)||LA106_0==144) ) {
                alt106=1;
            }
            else if ( ((LA106_0>=K_DISTINCT && LA106_0<=K_AS)||(LA106_0>=K_FILTERING && LA106_0<=K_TTL)||LA106_0==K_VALUES||LA106_0==K_EXISTS||LA106_0==K_TIMESTAMP||LA106_0==K_COUNTER||LA106_0==K_STATIC||(LA106_0>=K_KEY && LA106_0<=K_CUSTOM)||LA106_0==K_TRIGGER||LA106_0==K_TYPE||LA106_0==K_LIST||(LA106_0>=K_ALL && LA106_0<=K_PASSWORD)||(LA106_0>=K_ASCII && LA106_0<=K_MAP)) ) {
                alt106=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }
            switch (alt106) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:896:7: c= constant
                    {
                    pushFollow(FOLLOW_constant_in_propertyValue5508);
                    c=constant();

                    state._fsp--;

                     str = c.getRawText(); 

                    }
                    break;
                case 2 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:897:7: u= unreserved_keyword
                    {
                    pushFollow(FOLLOW_unreserved_keyword_in_propertyValue5530);
                    u=unreserved_keyword();

                    state._fsp--;

                     str = u; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return str;
    }
    // $ANTLR end "propertyValue"


    // $ANTLR start "relationType"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:900:1: relationType returns [Relation.Type op] : ( '=' | '<' | '<=' | '>' | '>=' );
    public final Relation.Type relationType() throws RecognitionException {
        Relation.Type op = null;

        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:901:5: ( '=' | '<' | '<=' | '>' | '>=' )
            int alt107=5;
            switch ( input.LA(1) ) {
            case 148:
                {
                alt107=1;
                }
                break;
            case 150:
                {
                alt107=2;
                }
                break;
            case 151:
                {
                alt107=3;
                }
                break;
            case 152:
                {
                alt107=4;
                }
                break;
            case 153:
                {
                alt107=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }

            switch (alt107) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:901:7: '='
                    {
                    match(input,148,FOLLOW_148_in_relationType5553); 
                     op = Relation.Type.EQ; 

                    }
                    break;
                case 2 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:902:7: '<'
                    {
                    match(input,150,FOLLOW_150_in_relationType5564); 
                     op = Relation.Type.LT; 

                    }
                    break;
                case 3 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:903:7: '<='
                    {
                    match(input,151,FOLLOW_151_in_relationType5575); 
                     op = Relation.Type.LTE; 

                    }
                    break;
                case 4 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:904:7: '>'
                    {
                    match(input,152,FOLLOW_152_in_relationType5585); 
                     op = Relation.Type.GT; 

                    }
                    break;
                case 5 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:905:7: '>='
                    {
                    match(input,153,FOLLOW_153_in_relationType5596); 
                     op = Relation.Type.GTE; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return op;
    }
    // $ANTLR end "relationType"


    // $ANTLR start "relation"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:908:1: relation[List<Relation> clauses] : (name= cident type= relationType t= term | K_TOKEN l= tupleOfIdentifiers type= relationType t= term | name= cident K_IN marker= inMarker | name= cident K_IN inValues= singleColumnInValues | ids= tupleOfIdentifiers ( K_IN ( '(' ')' | tupleInMarker= inMarkerForTuple | literals= tupleOfTupleLiterals | markers= tupleOfMarkersForTuples ) | type= relationType literal= tupleLiteral | type= relationType tupleMarker= markerForTuple ) | '(' relation[$clauses] ')' );
    public final void relation(List<Relation> clauses) throws RecognitionException {
        ColumnIdentifier.Raw name = null;

        Relation.Type type = null;

        Term.Raw t = null;

        List<ColumnIdentifier.Raw> l = null;

        AbstractMarker.INRaw marker = null;

        List<Term.Raw> inValues = null;

        List<ColumnIdentifier.Raw> ids = null;

        Tuples.INRaw tupleInMarker = null;

        List<Tuples.Literal> literals = null;

        List<Tuples.Raw> markers = null;

        Tuples.Literal literal = null;

        Tuples.Raw tupleMarker = null;


        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:909:5: (name= cident type= relationType t= term | K_TOKEN l= tupleOfIdentifiers type= relationType t= term | name= cident K_IN marker= inMarker | name= cident K_IN inValues= singleColumnInValues | ids= tupleOfIdentifiers ( K_IN ( '(' ')' | tupleInMarker= inMarkerForTuple | literals= tupleOfTupleLiterals | markers= tupleOfMarkersForTuples ) | type= relationType literal= tupleLiteral | type= relationType tupleMarker= markerForTuple ) | '(' relation[$clauses] ')' )
            int alt110=6;
            alt110 = dfa110.predict(input);
            switch (alt110) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:909:7: name= cident type= relationType t= term
                    {
                    pushFollow(FOLLOW_cident_in_relation5618);
                    name=cident();

                    state._fsp--;

                    pushFollow(FOLLOW_relationType_in_relation5622);
                    type=relationType();

                    state._fsp--;

                    pushFollow(FOLLOW_term_in_relation5626);
                    t=term();

                    state._fsp--;

                     clauses.add(new SingleColumnRelation(name, type, t)); 

                    }
                    break;
                case 2 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:910:7: K_TOKEN l= tupleOfIdentifiers type= relationType t= term
                    {
                    match(input,K_TOKEN,FOLLOW_K_TOKEN_in_relation5636); 
                    pushFollow(FOLLOW_tupleOfIdentifiers_in_relation5640);
                    l=tupleOfIdentifiers();

                    state._fsp--;

                    pushFollow(FOLLOW_relationType_in_relation5644);
                    type=relationType();

                    state._fsp--;

                    pushFollow(FOLLOW_term_in_relation5648);
                    t=term();

                    state._fsp--;


                                for (ColumnIdentifier.Raw id : l)
                                    clauses.add(new SingleColumnRelation(id, type, t, true));
                            

                    }
                    break;
                case 3 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:915:7: name= cident K_IN marker= inMarker
                    {
                    pushFollow(FOLLOW_cident_in_relation5668);
                    name=cident();

                    state._fsp--;

                    match(input,K_IN,FOLLOW_K_IN_in_relation5670); 
                    pushFollow(FOLLOW_inMarker_in_relation5674);
                    marker=inMarker();

                    state._fsp--;

                     clauses.add(new SingleColumnRelation(name, Relation.Type.IN, marker)); 

                    }
                    break;
                case 4 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:917:7: name= cident K_IN inValues= singleColumnInValues
                    {
                    pushFollow(FOLLOW_cident_in_relation5694);
                    name=cident();

                    state._fsp--;

                    match(input,K_IN,FOLLOW_K_IN_in_relation5696); 
                    pushFollow(FOLLOW_singleColumnInValues_in_relation5700);
                    inValues=singleColumnInValues();

                    state._fsp--;

                     clauses.add(SingleColumnRelation.createInRelation(name, inValues)); 

                    }
                    break;
                case 5 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:919:7: ids= tupleOfIdentifiers ( K_IN ( '(' ')' | tupleInMarker= inMarkerForTuple | literals= tupleOfTupleLiterals | markers= tupleOfMarkersForTuples ) | type= relationType literal= tupleLiteral | type= relationType tupleMarker= markerForTuple )
                    {
                    pushFollow(FOLLOW_tupleOfIdentifiers_in_relation5720);
                    ids=tupleOfIdentifiers();

                    state._fsp--;

                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:920:7: ( K_IN ( '(' ')' | tupleInMarker= inMarkerForTuple | literals= tupleOfTupleLiterals | markers= tupleOfMarkersForTuples ) | type= relationType literal= tupleLiteral | type= relationType tupleMarker= markerForTuple )
                    int alt109=3;
                    switch ( input.LA(1) ) {
                    case K_IN:
                        {
                        alt109=1;
                        }
                        break;
                    case 148:
                        {
                        int LA109_2 = input.LA(2);

                        if ( (LA109_2==QMARK||LA109_2==146) ) {
                            alt109=3;
                        }
                        else if ( (LA109_2==137) ) {
                            alt109=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 109, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 150:
                        {
                        int LA109_3 = input.LA(2);

                        if ( (LA109_3==QMARK||LA109_3==146) ) {
                            alt109=3;
                        }
                        else if ( (LA109_3==137) ) {
                            alt109=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 109, 3, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 151:
                        {
                        int LA109_4 = input.LA(2);

                        if ( (LA109_4==137) ) {
                            alt109=2;
                        }
                        else if ( (LA109_4==QMARK||LA109_4==146) ) {
                            alt109=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 109, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 152:
                        {
                        int LA109_5 = input.LA(2);

                        if ( (LA109_5==137) ) {
                            alt109=2;
                        }
                        else if ( (LA109_5==QMARK||LA109_5==146) ) {
                            alt109=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 109, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 153:
                        {
                        int LA109_6 = input.LA(2);

                        if ( (LA109_6==QMARK||LA109_6==146) ) {
                            alt109=3;
                        }
                        else if ( (LA109_6==137) ) {
                            alt109=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 109, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 109, 0, input);

                        throw nvae;
                    }

                    switch (alt109) {
                        case 1 :
                            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:920:9: K_IN ( '(' ')' | tupleInMarker= inMarkerForTuple | literals= tupleOfTupleLiterals | markers= tupleOfMarkersForTuples )
                            {
                            match(input,K_IN,FOLLOW_K_IN_in_relation5730); 
                            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:921:11: ( '(' ')' | tupleInMarker= inMarkerForTuple | literals= tupleOfTupleLiterals | markers= tupleOfMarkersForTuples )
                            int alt108=4;
                            int LA108_0 = input.LA(1);

                            if ( (LA108_0==137) ) {
                                switch ( input.LA(2) ) {
                                case 138:
                                    {
                                    alt108=1;
                                    }
                                    break;
                                case QMARK:
                                case 146:
                                    {
                                    alt108=4;
                                    }
                                    break;
                                case 137:
                                    {
                                    alt108=3;
                                    }
                                    break;
                                default:
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 108, 1, input);

                                    throw nvae;
                                }

                            }
                            else if ( (LA108_0==QMARK||LA108_0==146) ) {
                                alt108=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 108, 0, input);

                                throw nvae;
                            }
                            switch (alt108) {
                                case 1 :
                                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:921:13: '(' ')'
                                    {
                                    match(input,137,FOLLOW_137_in_relation5744); 
                                    match(input,138,FOLLOW_138_in_relation5746); 
                                     clauses.add(MultiColumnRelation.createInRelation(ids, new ArrayList<Tuples.Literal>())); 

                                    }
                                    break;
                                case 2 :
                                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:923:13: tupleInMarker= inMarkerForTuple
                                    {
                                    pushFollow(FOLLOW_inMarkerForTuple_in_relation5778);
                                    tupleInMarker=inMarkerForTuple();

                                    state._fsp--;

                                     clauses.add(MultiColumnRelation.createSingleMarkerInRelation(ids, tupleInMarker)); 

                                    }
                                    break;
                                case 3 :
                                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:925:13: literals= tupleOfTupleLiterals
                                    {
                                    pushFollow(FOLLOW_tupleOfTupleLiterals_in_relation5812);
                                    literals=tupleOfTupleLiterals();

                                    state._fsp--;


                                                      clauses.add(MultiColumnRelation.createInRelation(ids, literals));
                                                  

                                    }
                                    break;
                                case 4 :
                                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:929:13: markers= tupleOfMarkersForTuples
                                    {
                                    pushFollow(FOLLOW_tupleOfMarkersForTuples_in_relation5846);
                                    markers=tupleOfMarkersForTuples();

                                    state._fsp--;

                                     clauses.add(MultiColumnRelation.createInRelation(ids, markers)); 

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:932:9: type= relationType literal= tupleLiteral
                            {
                            pushFollow(FOLLOW_relationType_in_relation5888);
                            type=relationType();

                            state._fsp--;

                            pushFollow(FOLLOW_tupleLiteral_in_relation5892);
                            literal=tupleLiteral();

                            state._fsp--;


                                          clauses.add(MultiColumnRelation.createNonInRelation(ids, type, literal));
                                      

                            }
                            break;
                        case 3 :
                            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:936:9: type= relationType tupleMarker= markerForTuple
                            {
                            pushFollow(FOLLOW_relationType_in_relation5918);
                            type=relationType();

                            state._fsp--;

                            pushFollow(FOLLOW_markerForTuple_in_relation5922);
                            tupleMarker=markerForTuple();

                            state._fsp--;

                             clauses.add(MultiColumnRelation.createNonInRelation(ids, type, tupleMarker)); 

                            }
                            break;

                    }


                    }
                    break;
                case 6 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:939:7: '(' relation[$clauses] ')'
                    {
                    match(input,137,FOLLOW_137_in_relation5952); 
                    pushFollow(FOLLOW_relation_in_relation5954);
                    relation(clauses);

                    state._fsp--;

                    match(input,138,FOLLOW_138_in_relation5957); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "relation"


    // $ANTLR start "inMarker"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:942:1: inMarker returns [AbstractMarker.INRaw marker] : ( QMARK | ':' name= ident );
    public final AbstractMarker.INRaw inMarker() throws RecognitionException {
        AbstractMarker.INRaw marker = null;

        ColumnIdentifier name = null;


        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:943:5: ( QMARK | ':' name= ident )
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==QMARK) ) {
                alt111=1;
            }
            else if ( (LA111_0==146) ) {
                alt111=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }
            switch (alt111) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:943:7: QMARK
                    {
                    match(input,QMARK,FOLLOW_QMARK_in_inMarker5978); 
                     marker = newINBindVariables(null); 

                    }
                    break;
                case 2 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:944:7: ':' name= ident
                    {
                    match(input,146,FOLLOW_146_in_inMarker5988); 
                    pushFollow(FOLLOW_ident_in_inMarker5992);
                    name=ident();

                    state._fsp--;

                     marker = newINBindVariables(name); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return marker;
    }
    // $ANTLR end "inMarker"


    // $ANTLR start "tupleOfIdentifiers"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:947:1: tupleOfIdentifiers returns [List<ColumnIdentifier.Raw> ids] : '(' n1= cident ( ',' ni= cident )* ')' ;
    public final List<ColumnIdentifier.Raw> tupleOfIdentifiers() throws RecognitionException {
        List<ColumnIdentifier.Raw> ids = null;

        ColumnIdentifier.Raw n1 = null;

        ColumnIdentifier.Raw ni = null;


         ids = new ArrayList<ColumnIdentifier.Raw>(); 
        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:949:5: ( '(' n1= cident ( ',' ni= cident )* ')' )
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:949:7: '(' n1= cident ( ',' ni= cident )* ')'
            {
            match(input,137,FOLLOW_137_in_tupleOfIdentifiers6024); 
            pushFollow(FOLLOW_cident_in_tupleOfIdentifiers6028);
            n1=cident();

            state._fsp--;

             ids.add(n1); 
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:949:39: ( ',' ni= cident )*
            loop112:
            do {
                int alt112=2;
                int LA112_0 = input.LA(1);

                if ( (LA112_0==139) ) {
                    alt112=1;
                }


                switch (alt112) {
            	case 1 :
            	    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:949:40: ',' ni= cident
            	    {
            	    match(input,139,FOLLOW_139_in_tupleOfIdentifiers6033); 
            	    pushFollow(FOLLOW_cident_in_tupleOfIdentifiers6037);
            	    ni=cident();

            	    state._fsp--;

            	     ids.add(ni); 

            	    }
            	    break;

            	default :
            	    break loop112;
                }
            } while (true);

            match(input,138,FOLLOW_138_in_tupleOfIdentifiers6043); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ids;
    }
    // $ANTLR end "tupleOfIdentifiers"


    // $ANTLR start "singleColumnInValues"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:952:1: singleColumnInValues returns [List<Term.Raw> terms] : '(' (t1= term ( ',' ti= term )* )? ')' ;
    public final List<Term.Raw> singleColumnInValues() throws RecognitionException {
        List<Term.Raw> terms = null;

        Term.Raw t1 = null;

        Term.Raw ti = null;


         terms = new ArrayList<Term.Raw>(); 
        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:954:5: ( '(' (t1= term ( ',' ti= term )* )? ')' )
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:954:7: '(' (t1= term ( ',' ti= term )* )? ')'
            {
            match(input,137,FOLLOW_137_in_singleColumnInValues6073); 
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:954:11: (t1= term ( ',' ti= term )* )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==K_DISTINCT||LA114_0==K_AS||LA114_0==K_FILTERING||LA114_0==INTEGER||LA114_0==K_VALUES||LA114_0==K_EXISTS||LA114_0==K_TIMESTAMP||LA114_0==K_COUNTER||LA114_0==K_STATIC||(LA114_0>=K_KEY && LA114_0<=K_CUSTOM)||LA114_0==IDENT||(LA114_0>=STRING_LITERAL && LA114_0<=K_TRIGGER)||LA114_0==K_TYPE||LA114_0==K_LIST||(LA114_0>=K_ALL && LA114_0<=K_PASSWORD)||(LA114_0>=QMARK && LA114_0<=K_TOKEN)||(LA114_0>=K_ASCII && LA114_0<=K_MAP)||LA114_0==137||LA114_0==141||(LA114_0>=144 && LA114_0<=146)) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:954:13: t1= term ( ',' ti= term )*
                    {
                    pushFollow(FOLLOW_term_in_singleColumnInValues6081);
                    t1=term();

                    state._fsp--;

                     terms.add(t1); 
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:954:43: ( ',' ti= term )*
                    loop113:
                    do {
                        int alt113=2;
                        int LA113_0 = input.LA(1);

                        if ( (LA113_0==139) ) {
                            alt113=1;
                        }


                        switch (alt113) {
                    	case 1 :
                    	    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:954:44: ',' ti= term
                    	    {
                    	    match(input,139,FOLLOW_139_in_singleColumnInValues6086); 
                    	    pushFollow(FOLLOW_term_in_singleColumnInValues6090);
                    	    ti=term();

                    	    state._fsp--;

                    	     terms.add(ti); 

                    	    }
                    	    break;

                    	default :
                    	    break loop113;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,138,FOLLOW_138_in_singleColumnInValues6099); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return terms;
    }
    // $ANTLR end "singleColumnInValues"


    // $ANTLR start "tupleLiteral"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:957:1: tupleLiteral returns [Tuples.Literal literal] : '(' t1= term ( ',' ti= term )* ')' ;
    public final Tuples.Literal tupleLiteral() throws RecognitionException {
        Tuples.Literal literal = null;

        Term.Raw t1 = null;

        Term.Raw ti = null;


         List<Term.Raw> terms = new ArrayList<>(); 
        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:959:5: ( '(' t1= term ( ',' ti= term )* ')' )
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:959:7: '(' t1= term ( ',' ti= term )* ')'
            {
            match(input,137,FOLLOW_137_in_tupleLiteral6129); 
            pushFollow(FOLLOW_term_in_tupleLiteral6133);
            t1=term();

            state._fsp--;

             terms.add(t1); 
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:959:38: ( ',' ti= term )*
            loop115:
            do {
                int alt115=2;
                int LA115_0 = input.LA(1);

                if ( (LA115_0==139) ) {
                    alt115=1;
                }


                switch (alt115) {
            	case 1 :
            	    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:959:39: ',' ti= term
            	    {
            	    match(input,139,FOLLOW_139_in_tupleLiteral6138); 
            	    pushFollow(FOLLOW_term_in_tupleLiteral6142);
            	    ti=term();

            	    state._fsp--;

            	     terms.add(ti); 

            	    }
            	    break;

            	default :
            	    break loop115;
                }
            } while (true);

            match(input,138,FOLLOW_138_in_tupleLiteral6148); 
             literal = new Tuples.Literal(terms); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return literal;
    }
    // $ANTLR end "tupleLiteral"


    // $ANTLR start "tupleOfTupleLiterals"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:962:1: tupleOfTupleLiterals returns [List<Tuples.Literal> literals] : '(' t1= tupleLiteral ( ',' ti= tupleLiteral )* ')' ;
    public final List<Tuples.Literal> tupleOfTupleLiterals() throws RecognitionException {
        List<Tuples.Literal> literals = null;

        Tuples.Literal t1 = null;

        Tuples.Literal ti = null;


         literals = new ArrayList<>(); 
        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:964:5: ( '(' t1= tupleLiteral ( ',' ti= tupleLiteral )* ')' )
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:964:7: '(' t1= tupleLiteral ( ',' ti= tupleLiteral )* ')'
            {
            match(input,137,FOLLOW_137_in_tupleOfTupleLiterals6180); 
            pushFollow(FOLLOW_tupleLiteral_in_tupleOfTupleLiterals6184);
            t1=tupleLiteral();

            state._fsp--;

             literals.add(t1); 
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:964:50: ( ',' ti= tupleLiteral )*
            loop116:
            do {
                int alt116=2;
                int LA116_0 = input.LA(1);

                if ( (LA116_0==139) ) {
                    alt116=1;
                }


                switch (alt116) {
            	case 1 :
            	    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:964:51: ',' ti= tupleLiteral
            	    {
            	    match(input,139,FOLLOW_139_in_tupleOfTupleLiterals6189); 
            	    pushFollow(FOLLOW_tupleLiteral_in_tupleOfTupleLiterals6193);
            	    ti=tupleLiteral();

            	    state._fsp--;

            	     literals.add(ti); 

            	    }
            	    break;

            	default :
            	    break loop116;
                }
            } while (true);

            match(input,138,FOLLOW_138_in_tupleOfTupleLiterals6199); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return literals;
    }
    // $ANTLR end "tupleOfTupleLiterals"


    // $ANTLR start "markerForTuple"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:967:1: markerForTuple returns [Tuples.Raw marker] : ( QMARK | ':' name= ident );
    public final Tuples.Raw markerForTuple() throws RecognitionException {
        Tuples.Raw marker = null;

        ColumnIdentifier name = null;


        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:968:5: ( QMARK | ':' name= ident )
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==QMARK) ) {
                alt117=1;
            }
            else if ( (LA117_0==146) ) {
                alt117=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 117, 0, input);

                throw nvae;
            }
            switch (alt117) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:968:7: QMARK
                    {
                    match(input,QMARK,FOLLOW_QMARK_in_markerForTuple6220); 
                     marker = newTupleBindVariables(null); 

                    }
                    break;
                case 2 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:969:7: ':' name= ident
                    {
                    match(input,146,FOLLOW_146_in_markerForTuple6230); 
                    pushFollow(FOLLOW_ident_in_markerForTuple6234);
                    name=ident();

                    state._fsp--;

                     marker = newTupleBindVariables(name); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return marker;
    }
    // $ANTLR end "markerForTuple"


    // $ANTLR start "tupleOfMarkersForTuples"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:972:1: tupleOfMarkersForTuples returns [List<Tuples.Raw> markers] : '(' m1= markerForTuple ( ',' mi= markerForTuple )* ')' ;
    public final List<Tuples.Raw> tupleOfMarkersForTuples() throws RecognitionException {
        List<Tuples.Raw> markers = null;

        Tuples.Raw m1 = null;

        Tuples.Raw mi = null;


         markers = new ArrayList<Tuples.Raw>(); 
        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:974:5: ( '(' m1= markerForTuple ( ',' mi= markerForTuple )* ')' )
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:974:7: '(' m1= markerForTuple ( ',' mi= markerForTuple )* ')'
            {
            match(input,137,FOLLOW_137_in_tupleOfMarkersForTuples6266); 
            pushFollow(FOLLOW_markerForTuple_in_tupleOfMarkersForTuples6270);
            m1=markerForTuple();

            state._fsp--;

             markers.add(m1); 
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:974:51: ( ',' mi= markerForTuple )*
            loop118:
            do {
                int alt118=2;
                int LA118_0 = input.LA(1);

                if ( (LA118_0==139) ) {
                    alt118=1;
                }


                switch (alt118) {
            	case 1 :
            	    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:974:52: ',' mi= markerForTuple
            	    {
            	    match(input,139,FOLLOW_139_in_tupleOfMarkersForTuples6275); 
            	    pushFollow(FOLLOW_markerForTuple_in_tupleOfMarkersForTuples6279);
            	    mi=markerForTuple();

            	    state._fsp--;

            	     markers.add(mi); 

            	    }
            	    break;

            	default :
            	    break loop118;
                }
            } while (true);

            match(input,138,FOLLOW_138_in_tupleOfMarkersForTuples6285); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return markers;
    }
    // $ANTLR end "tupleOfMarkersForTuples"


    // $ANTLR start "inMarkerForTuple"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:977:1: inMarkerForTuple returns [Tuples.INRaw marker] : ( QMARK | ':' name= ident );
    public final Tuples.INRaw inMarkerForTuple() throws RecognitionException {
        Tuples.INRaw marker = null;

        ColumnIdentifier name = null;


        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:978:5: ( QMARK | ':' name= ident )
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==QMARK) ) {
                alt119=1;
            }
            else if ( (LA119_0==146) ) {
                alt119=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 119, 0, input);

                throw nvae;
            }
            switch (alt119) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:978:7: QMARK
                    {
                    match(input,QMARK,FOLLOW_QMARK_in_inMarkerForTuple6306); 
                     marker = newTupleINBindVariables(null); 

                    }
                    break;
                case 2 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:979:7: ':' name= ident
                    {
                    match(input,146,FOLLOW_146_in_inMarkerForTuple6316); 
                    pushFollow(FOLLOW_ident_in_inMarkerForTuple6320);
                    name=ident();

                    state._fsp--;

                     marker = newTupleINBindVariables(name); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return marker;
    }
    // $ANTLR end "inMarkerForTuple"


    // $ANTLR start "comparatorType"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:982:1: comparatorType returns [CQL3Type t] : (c= native_type | c= collection_type | s= STRING_LITERAL );
    public final CQL3Type comparatorType() throws RecognitionException {
        CQL3Type t = null;

        Token s=null;
        CQL3Type c = null;


        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:983:5: (c= native_type | c= collection_type | s= STRING_LITERAL )
            int alt120=3;
            switch ( input.LA(1) ) {
            case K_TIMESTAMP:
            case K_COUNTER:
            case K_ASCII:
            case K_BIGINT:
            case K_BLOB:
            case K_BOOLEAN:
            case K_DECIMAL:
            case K_DOUBLE:
            case K_FLOAT:
            case K_INET:
            case K_INT:
            case K_TEXT:
            case K_UUID:
            case K_VARCHAR:
            case K_VARINT:
            case K_TIMEUUID:
                {
                alt120=1;
                }
                break;
            case K_SET:
            case K_LIST:
            case K_MAP:
                {
                alt120=2;
                }
                break;
            case STRING_LITERAL:
                {
                alt120=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 0, input);

                throw nvae;
            }

            switch (alt120) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:983:7: c= native_type
                    {
                    pushFollow(FOLLOW_native_type_in_comparatorType6345);
                    c=native_type();

                    state._fsp--;

                     t = c; 

                    }
                    break;
                case 2 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:984:7: c= collection_type
                    {
                    pushFollow(FOLLOW_collection_type_in_comparatorType6361);
                    c=collection_type();

                    state._fsp--;

                     t = c; 

                    }
                    break;
                case 3 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:985:7: s= STRING_LITERAL
                    {
                    s=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_comparatorType6373); 

                            try {
                                t = new CQL3Type.Custom((s!=null?s.getText():null));
                            } catch (SyntaxException e) {
                                addRecognitionError("Cannot parse type " + (s!=null?s.getText():null) + ": " + e.getMessage());
                            } catch (ConfigurationException e) {
                                addRecognitionError("Error setting type " + (s!=null?s.getText():null) + ": " + e.getMessage());
                            }
                          

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return t;
    }
    // $ANTLR end "comparatorType"


    // $ANTLR start "native_type"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:997:1: native_type returns [CQL3Type t] : ( K_ASCII | K_BIGINT | K_BLOB | K_BOOLEAN | K_COUNTER | K_DECIMAL | K_DOUBLE | K_FLOAT | K_INET | K_INT | K_TEXT | K_TIMESTAMP | K_UUID | K_VARCHAR | K_VARINT | K_TIMEUUID );
    public final CQL3Type native_type() throws RecognitionException {
        CQL3Type t = null;

        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:998:5: ( K_ASCII | K_BIGINT | K_BLOB | K_BOOLEAN | K_COUNTER | K_DECIMAL | K_DOUBLE | K_FLOAT | K_INET | K_INT | K_TEXT | K_TIMESTAMP | K_UUID | K_VARCHAR | K_VARINT | K_TIMEUUID )
            int alt121=16;
            switch ( input.LA(1) ) {
            case K_ASCII:
                {
                alt121=1;
                }
                break;
            case K_BIGINT:
                {
                alt121=2;
                }
                break;
            case K_BLOB:
                {
                alt121=3;
                }
                break;
            case K_BOOLEAN:
                {
                alt121=4;
                }
                break;
            case K_COUNTER:
                {
                alt121=5;
                }
                break;
            case K_DECIMAL:
                {
                alt121=6;
                }
                break;
            case K_DOUBLE:
                {
                alt121=7;
                }
                break;
            case K_FLOAT:
                {
                alt121=8;
                }
                break;
            case K_INET:
                {
                alt121=9;
                }
                break;
            case K_INT:
                {
                alt121=10;
                }
                break;
            case K_TEXT:
                {
                alt121=11;
                }
                break;
            case K_TIMESTAMP:
                {
                alt121=12;
                }
                break;
            case K_UUID:
                {
                alt121=13;
                }
                break;
            case K_VARCHAR:
                {
                alt121=14;
                }
                break;
            case K_VARINT:
                {
                alt121=15;
                }
                break;
            case K_TIMEUUID:
                {
                alt121=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 121, 0, input);

                throw nvae;
            }

            switch (alt121) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:998:7: K_ASCII
                    {
                    match(input,K_ASCII,FOLLOW_K_ASCII_in_native_type6402); 
                     t = CQL3Type.Native.ASCII; 

                    }
                    break;
                case 2 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:999:7: K_BIGINT
                    {
                    match(input,K_BIGINT,FOLLOW_K_BIGINT_in_native_type6416); 
                     t = CQL3Type.Native.BIGINT; 

                    }
                    break;
                case 3 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:1000:7: K_BLOB
                    {
                    match(input,K_BLOB,FOLLOW_K_BLOB_in_native_type6429); 
                     t = CQL3Type.Native.BLOB; 

                    }
                    break;
                case 4 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:1001:7: K_BOOLEAN
                    {
                    match(input,K_BOOLEAN,FOLLOW_K_BOOLEAN_in_native_type6444); 
                     t = CQL3Type.Native.BOOLEAN; 

                    }
                    break;
                case 5 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:1002:7: K_COUNTER
                    {
                    match(input,K_COUNTER,FOLLOW_K_COUNTER_in_native_type6456); 
                     t = CQL3Type.Native.COUNTER; 

                    }
                    break;
                case 6 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:1003:7: K_DECIMAL
                    {
                    match(input,K_DECIMAL,FOLLOW_K_DECIMAL_in_native_type6468); 
                     t = CQL3Type.Native.DECIMAL; 

                    }
                    break;
                case 7 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:1004:7: K_DOUBLE
                    {
                    match(input,K_DOUBLE,FOLLOW_K_DOUBLE_in_native_type6480); 
                     t = CQL3Type.Native.DOUBLE; 

                    }
                    break;
                case 8 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:1005:7: K_FLOAT
                    {
                    match(input,K_FLOAT,FOLLOW_K_FLOAT_in_native_type6493); 
                     t = CQL3Type.Native.FLOAT; 

                    }
                    break;
                case 9 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:1006:7: K_INET
                    {
                    match(input,K_INET,FOLLOW_K_INET_in_native_type6507); 
                     t = CQL3Type.Native.INET;

                    }
                    break;
                case 10 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:1007:7: K_INT
                    {
                    match(input,K_INT,FOLLOW_K_INT_in_native_type6522); 
                     t = CQL3Type.Native.INT; 

                    }
                    break;
                case 11 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:1008:7: K_TEXT
                    {
                    match(input,K_TEXT,FOLLOW_K_TEXT_in_native_type6538); 
                     t = CQL3Type.Native.TEXT; 

                    }
                    break;
                case 12 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:1009:7: K_TIMESTAMP
                    {
                    match(input,K_TIMESTAMP,FOLLOW_K_TIMESTAMP_in_native_type6553); 
                     t = CQL3Type.Native.TIMESTAMP; 

                    }
                    break;
                case 13 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:1010:7: K_UUID
                    {
                    match(input,K_UUID,FOLLOW_K_UUID_in_native_type6563); 
                     t = CQL3Type.Native.UUID; 

                    }
                    break;
                case 14 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:1011:7: K_VARCHAR
                    {
                    match(input,K_VARCHAR,FOLLOW_K_VARCHAR_in_native_type6578); 
                     t = CQL3Type.Native.VARCHAR; 

                    }
                    break;
                case 15 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:1012:7: K_VARINT
                    {
                    match(input,K_VARINT,FOLLOW_K_VARINT_in_native_type6590); 
                     t = CQL3Type.Native.VARINT; 

                    }
                    break;
                case 16 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:1013:7: K_TIMEUUID
                    {
                    match(input,K_TIMEUUID,FOLLOW_K_TIMEUUID_in_native_type6603); 
                     t = CQL3Type.Native.TIMEUUID; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return t;
    }
    // $ANTLR end "native_type"


    // $ANTLR start "collection_type"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:1016:1: collection_type returns [CQL3Type pt] : ( K_MAP '<' t1= comparatorType ',' t2= comparatorType '>' | K_LIST '<' t= comparatorType '>' | K_SET '<' t= comparatorType '>' );
    public final CQL3Type collection_type() throws RecognitionException {
        CQL3Type pt = null;

        CQL3Type t1 = null;

        CQL3Type t2 = null;

        CQL3Type t = null;


        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:1017:5: ( K_MAP '<' t1= comparatorType ',' t2= comparatorType '>' | K_LIST '<' t= comparatorType '>' | K_SET '<' t= comparatorType '>' )
            int alt122=3;
            switch ( input.LA(1) ) {
            case K_MAP:
                {
                alt122=1;
                }
                break;
            case K_LIST:
                {
                alt122=2;
                }
                break;
            case K_SET:
                {
                alt122=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 122, 0, input);

                throw nvae;
            }

            switch (alt122) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:1017:7: K_MAP '<' t1= comparatorType ',' t2= comparatorType '>'
                    {
                    match(input,K_MAP,FOLLOW_K_MAP_in_collection_type6627); 
                    match(input,150,FOLLOW_150_in_collection_type6630); 
                    pushFollow(FOLLOW_comparatorType_in_collection_type6634);
                    t1=comparatorType();

                    state._fsp--;

                    match(input,139,FOLLOW_139_in_collection_type6636); 
                    pushFollow(FOLLOW_comparatorType_in_collection_type6640);
                    t2=comparatorType();

                    state._fsp--;

                    match(input,152,FOLLOW_152_in_collection_type6642); 
                     try {
                                // if we can't parse either t1 or t2, antlr will "recover" and we may have t1 or t2 null.
                                if (t1 != null && t2 != null)
                                    pt = CQL3Type.Collection.map(t1, t2);
                              } catch (InvalidRequestException e) { addRecognitionError(e.getMessage()); } 

                    }
                    break;
                case 2 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:1023:7: K_LIST '<' t= comparatorType '>'
                    {
                    match(input,K_LIST,FOLLOW_K_LIST_in_collection_type6660); 
                    match(input,150,FOLLOW_150_in_collection_type6662); 
                    pushFollow(FOLLOW_comparatorType_in_collection_type6666);
                    t=comparatorType();

                    state._fsp--;

                    match(input,152,FOLLOW_152_in_collection_type6668); 
                     try { if (t != null) pt = CQL3Type.Collection.list(t); } catch (InvalidRequestException e) { addRecognitionError(e.getMessage()); } 

                    }
                    break;
                case 3 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:1025:7: K_SET '<' t= comparatorType '>'
                    {
                    match(input,K_SET,FOLLOW_K_SET_in_collection_type6686); 
                    match(input,150,FOLLOW_150_in_collection_type6689); 
                    pushFollow(FOLLOW_comparatorType_in_collection_type6693);
                    t=comparatorType();

                    state._fsp--;

                    match(input,152,FOLLOW_152_in_collection_type6695); 
                     try { if (t != null) pt = CQL3Type.Collection.set(t); } catch (InvalidRequestException e) { addRecognitionError(e.getMessage()); } 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return pt;
    }
    // $ANTLR end "collection_type"

    public static class username_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "username"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:1029:1: username : ( IDENT | STRING_LITERAL );
    public final CqlParser.username_return username() throws RecognitionException {
        CqlParser.username_return retval = new CqlParser.username_return();
        retval.start = input.LT(1);

        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:1030:5: ( IDENT | STRING_LITERAL )
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:
            {
            if ( input.LA(1)==IDENT||input.LA(1)==STRING_LITERAL ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "username"


    // $ANTLR start "unreserved_keyword"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:1034:1: unreserved_keyword returns [String str] : (u= unreserved_function_keyword | k= ( K_TTL | K_COUNT | K_WRITETIME ) );
    public final String unreserved_keyword() throws RecognitionException {
        String str = null;

        Token k=null;
        String u = null;


        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:1035:5: (u= unreserved_function_keyword | k= ( K_TTL | K_COUNT | K_WRITETIME ) )
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==K_DISTINCT||LA123_0==K_AS||LA123_0==K_FILTERING||LA123_0==K_VALUES||LA123_0==K_EXISTS||LA123_0==K_TIMESTAMP||LA123_0==K_COUNTER||LA123_0==K_STATIC||(LA123_0>=K_KEY && LA123_0<=K_CUSTOM)||LA123_0==K_TRIGGER||LA123_0==K_TYPE||LA123_0==K_LIST||(LA123_0>=K_ALL && LA123_0<=K_PASSWORD)||(LA123_0>=K_ASCII && LA123_0<=K_MAP)) ) {
                alt123=1;
            }
            else if ( (LA123_0==K_COUNT||(LA123_0>=K_WRITETIME && LA123_0<=K_TTL)) ) {
                alt123=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 0, input);

                throw nvae;
            }
            switch (alt123) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:1035:7: u= unreserved_function_keyword
                    {
                    pushFollow(FOLLOW_unreserved_function_keyword_in_unreserved_keyword6753);
                    u=unreserved_function_keyword();

                    state._fsp--;

                     str = u; 

                    }
                    break;
                case 2 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:1036:7: k= ( K_TTL | K_COUNT | K_WRITETIME )
                    {
                    k=(Token)input.LT(1);
                    if ( input.LA(1)==K_COUNT||(input.LA(1)>=K_WRITETIME && input.LA(1)<=K_TTL) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                     str = (k!=null?k.getText():null); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return str;
    }
    // $ANTLR end "unreserved_keyword"


    // $ANTLR start "unreserved_function_keyword"
    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:1039:1: unreserved_function_keyword returns [String str] : (k= ( K_KEY | K_AS | K_CLUSTERING | K_COMPACT | K_STORAGE | K_TYPE | K_VALUES | K_MAP | K_LIST | K_FILTERING | K_PERMISSION | K_PERMISSIONS | K_KEYSPACES | K_ALL | K_USER | K_USERS | K_SUPERUSER | K_NOSUPERUSER | K_PASSWORD | K_EXISTS | K_CUSTOM | K_TRIGGER | K_DISTINCT | K_STATIC ) | t= native_type );
    public final String unreserved_function_keyword() throws RecognitionException {
        String str = null;

        Token k=null;
        CQL3Type t = null;


        try {
            // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:1040:5: (k= ( K_KEY | K_AS | K_CLUSTERING | K_COMPACT | K_STORAGE | K_TYPE | K_VALUES | K_MAP | K_LIST | K_FILTERING | K_PERMISSION | K_PERMISSIONS | K_KEYSPACES | K_ALL | K_USER | K_USERS | K_SUPERUSER | K_NOSUPERUSER | K_PASSWORD | K_EXISTS | K_CUSTOM | K_TRIGGER | K_DISTINCT | K_STATIC ) | t= native_type )
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==K_DISTINCT||LA124_0==K_AS||LA124_0==K_FILTERING||LA124_0==K_VALUES||LA124_0==K_EXISTS||LA124_0==K_STATIC||(LA124_0>=K_KEY && LA124_0<=K_CUSTOM)||LA124_0==K_TRIGGER||LA124_0==K_TYPE||LA124_0==K_LIST||(LA124_0>=K_ALL && LA124_0<=K_PASSWORD)||LA124_0==K_MAP) ) {
                alt124=1;
            }
            else if ( (LA124_0==K_TIMESTAMP||LA124_0==K_COUNTER||(LA124_0>=K_ASCII && LA124_0<=K_TIMEUUID)) ) {
                alt124=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 124, 0, input);

                throw nvae;
            }
            switch (alt124) {
                case 1 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:1040:7: k= ( K_KEY | K_AS | K_CLUSTERING | K_COMPACT | K_STORAGE | K_TYPE | K_VALUES | K_MAP | K_LIST | K_FILTERING | K_PERMISSION | K_PERMISSIONS | K_KEYSPACES | K_ALL | K_USER | K_USERS | K_SUPERUSER | K_NOSUPERUSER | K_PASSWORD | K_EXISTS | K_CUSTOM | K_TRIGGER | K_DISTINCT | K_STATIC )
                    {
                    k=(Token)input.LT(1);
                    if ( input.LA(1)==K_DISTINCT||input.LA(1)==K_AS||input.LA(1)==K_FILTERING||input.LA(1)==K_VALUES||input.LA(1)==K_EXISTS||input.LA(1)==K_STATIC||(input.LA(1)>=K_KEY && input.LA(1)<=K_CUSTOM)||input.LA(1)==K_TRIGGER||input.LA(1)==K_TYPE||input.LA(1)==K_LIST||(input.LA(1)>=K_ALL && input.LA(1)<=K_PASSWORD)||input.LA(1)==K_MAP ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                     str = (k!=null?k.getText():null); 

                    }
                    break;
                case 2 :
                    // /home/washim/cassandra-c3/src/java/org/apache/cassandra/cql3/Cql.g:1065:7: t= native_type
                    {
                    pushFollow(FOLLOW_native_type_in_unreserved_function_keyword7104);
                    t=native_type();

                    state._fsp--;

                     str = t.toString(); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return str;
    }
    // $ANTLR end "unreserved_function_keyword"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA83 dfa83 = new DFA83(this);
    protected DFA102 dfa102 = new DFA102(this);
    protected DFA103 dfa103 = new DFA103(this);
    protected DFA110 dfa110 = new DFA110(this);
    static final String DFA2_eotS =
        "\35\uffff";
    static final String DFA2_eofS =
        "\35\uffff";
    static final String DFA2_minS =
        "\1\4\7\uffff\3\47\2\uffff\1\5\17\uffff";
    static final String DFA2_maxS =
        "\1\77\7\uffff\3\110\2\uffff\1\113\17\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\3\uffff\1\20\1\21\1\uffff\1"+
        "\10\1\11\1\23\1\27\1\12\1\13\1\14\1\15\1\25\1\30\1\16\1\17\1\24"+
        "\1\26\1\22";
    static final String DFA2_specialS =
        "\35\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\6\1\1\20\uffff\1\2\7\uffff\1\3\1\uffff\1\5\1\4\4\uffff\1"+
            "\10\17\uffff\1\11\1\12\4\uffff\1\7\1\13\1\14\1\15",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\16\1\uffff\1\17\6\uffff\2\22\3\uffff\1\21\22\uffff\1\20",
            "\1\23\1\uffff\1\24\7\uffff\1\25\3\uffff\1\27\22\uffff\1\26",
            "\1\31\1\uffff\1\30\36\uffff\1\32",
            "",
            "",
            "\1\34\40\uffff\1\34\17\uffff\2\34\12\uffff\3\34\6\uffff\1\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "206:1: cqlStatement returns [ParsedStatement stmt] : (st1= selectStatement | st2= insertStatement | st3= updateStatement | st4= batchStatement | st5= deleteStatement | st6= useStatement | st7= truncateStatement | st8= createKeyspaceStatement | st9= createTableStatement | st10= createIndexStatement | st11= dropKeyspaceStatement | st12= dropTableStatement | st13= dropIndexStatement | st14= alterTableStatement | st15= alterKeyspaceStatement | st16= grantStatement | st17= revokeStatement | st18= listPermissionsStatement | st19= createUserStatement | st20= alterUserStatement | st21= dropUserStatement | st22= listUsersStatement | st23= createTriggerStatement | st24= dropTriggerStatement );";
        }
    }
    static final String DFA14_eotS =
        "\31\uffff";
    static final String DFA14_eofS =
        "\31\uffff";
    static final String DFA14_minS =
        "\1\6\1\10\1\uffff\23\10\3\uffff";
    static final String DFA14_maxS =
        "\1\146\1\u008b\1\uffff\23\u008b\3\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\1\23\uffff\1\4\1\2\1\3";
    static final String DFA14_specialS =
        "\31\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\3\1\2\1\3\6\uffff\1\3\1\24\1\25\6\uffff\1\3\2\uffff\1\3\1"+
            "\uffff\1\17\5\uffff\1\10\6\uffff\1\3\1\uffff\5\3\1\uffff\1\1"+
            "\2\uffff\1\3\2\uffff\1\3\6\uffff\1\3\4\uffff\11\3\1\2\10\uffff"+
            "\1\26\1\uffff\1\4\1\5\1\6\1\7\1\11\1\12\1\13\1\14\1\15\1\16"+
            "\1\20\1\21\1\22\1\23\1\3",
            "\2\2\177\uffff\1\26\2\2",
            "",
            "\2\2\177\uffff\1\26\2\2",
            "\2\2\177\uffff\1\26\2\2",
            "\2\2\177\uffff\1\26\2\2",
            "\2\2\177\uffff\1\26\2\2",
            "\2\2\177\uffff\1\26\2\2",
            "\2\2\177\uffff\1\26\2\2",
            "\2\2\177\uffff\1\26\2\2",
            "\2\2\177\uffff\1\26\2\2",
            "\2\2\177\uffff\1\26\2\2",
            "\2\2\177\uffff\1\26\2\2",
            "\2\2\177\uffff\1\26\2\2",
            "\2\2\177\uffff\1\26\2\2",
            "\2\2\177\uffff\1\26\2\2",
            "\2\2\177\uffff\1\26\2\2",
            "\2\2\177\uffff\1\26\2\2",
            "\2\2\177\uffff\1\26\2\2",
            "\2\2\177\uffff\1\26\2\2",
            "\2\2\177\uffff\1\27\2\2",
            "\2\2\177\uffff\1\30\2\2",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "283:1: unaliasedSelector returns [Selectable.Raw s] : (c= cident | K_WRITETIME '(' c= cident ')' | K_TTL '(' c= cident ')' | f= functionName args= selectionFunctionArgs );";
        }
    }
    static final String DFA35_eotS =
        "\27\uffff";
    static final String DFA35_eofS =
        "\27\uffff";
    static final String DFA35_minS =
        "\1\6\24\11\2\uffff";
    static final String DFA35_maxS =
        "\1\146\24\u008d\2\uffff";
    static final String DFA35_acceptS =
        "\25\uffff\1\2\1\1";
    static final String DFA35_specialS =
        "\27\uffff}>";
    static final String[] DFA35_transitionS = {
            "\1\3\1\24\1\3\6\uffff\1\3\2\24\6\uffff\1\3\2\uffff\1\3\1\uffff"+
            "\1\17\5\uffff\1\10\6\uffff\1\3\1\uffff\5\3\1\uffff\1\1\2\uffff"+
            "\1\3\2\uffff\1\3\6\uffff\1\3\4\uffff\11\3\1\2\12\uffff\1\4\1"+
            "\5\1\6\1\7\1\11\1\12\1\13\1\14\1\15\1\16\1\20\1\21\1\22\1\23"+
            "\1\3",
            "\1\26\u0081\uffff\1\26\1\uffff\1\25",
            "\1\26\u0081\uffff\1\26\1\uffff\1\25",
            "\1\26\u0081\uffff\1\26\1\uffff\1\25",
            "\1\26\u0081\uffff\1\26\1\uffff\1\25",
            "\1\26\u0081\uffff\1\26\1\uffff\1\25",
            "\1\26\u0081\uffff\1\26\1\uffff\1\25",
            "\1\26\u0081\uffff\1\26\1\uffff\1\25",
            "\1\26\u0081\uffff\1\26\1\uffff\1\25",
            "\1\26\u0081\uffff\1\26\1\uffff\1\25",
            "\1\26\u0081\uffff\1\26\1\uffff\1\25",
            "\1\26\u0081\uffff\1\26\1\uffff\1\25",
            "\1\26\u0081\uffff\1\26\1\uffff\1\25",
            "\1\26\u0081\uffff\1\26\1\uffff\1\25",
            "\1\26\u0081\uffff\1\26\1\uffff\1\25",
            "\1\26\u0081\uffff\1\26\1\uffff\1\25",
            "\1\26\u0081\uffff\1\26\1\uffff\1\25",
            "\1\26\u0081\uffff\1\26\1\uffff\1\25",
            "\1\26\u0081\uffff\1\26\1\uffff\1\25",
            "\1\26\u0081\uffff\1\26\1\uffff\1\25",
            "\1\26\u0081\uffff\1\26\1\uffff\1\25",
            "",
            ""
    };

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "418:1: deleteOp returns [Operation.RawDeletion op] : (c= cident | c= cident '[' t= term ']' );";
        }
    }
    static final String DFA83_eotS =
        "\30\uffff";
    static final String DFA83_eofS =
        "\1\uffff\25\27\2\uffff";
    static final String DFA83_minS =
        "\1\6\25\11\2\uffff";
    static final String DFA83_maxS =
        "\1\146\25\u008f\2\uffff";
    static final String DFA83_acceptS =
        "\26\uffff\1\1\1\2";
    static final String DFA83_specialS =
        "\30\uffff}>";
    static final String[] DFA83_transitionS = {
            "\1\3\1\24\1\3\6\uffff\1\3\2\24\6\uffff\1\3\2\uffff\1\3\1\uffff"+
            "\1\17\5\uffff\1\10\6\uffff\1\3\1\uffff\5\3\1\uffff\1\1\2\uffff"+
            "\1\3\2\uffff\1\3\6\uffff\1\3\4\uffff\11\3\1\2\1\25\11\uffff"+
            "\1\4\1\5\1\6\1\7\1\11\1\12\1\13\1\14\1\15\1\16\1\20\1\21\1\22"+
            "\1\23\1\3",
            "\3\27\1\uffff\2\27\15\uffff\1\27\2\uffff\1\27\10\uffff\1\27"+
            "\15\uffff\2\27\1\uffff\3\27\4\uffff\2\27\106\uffff\2\27\5\uffff"+
            "\1\26",
            "\3\27\1\uffff\2\27\15\uffff\1\27\2\uffff\1\27\10\uffff\1\27"+
            "\15\uffff\2\27\1\uffff\3\27\4\uffff\2\27\106\uffff\2\27\5\uffff"+
            "\1\26",
            "\3\27\1\uffff\2\27\15\uffff\1\27\2\uffff\1\27\10\uffff\1\27"+
            "\15\uffff\2\27\1\uffff\3\27\4\uffff\2\27\106\uffff\2\27\5\uffff"+
            "\1\26",
            "\3\27\1\uffff\2\27\15\uffff\1\27\2\uffff\1\27\10\uffff\1\27"+
            "\15\uffff\2\27\1\uffff\3\27\4\uffff\2\27\106\uffff\2\27\5\uffff"+
            "\1\26",
            "\3\27\1\uffff\2\27\15\uffff\1\27\2\uffff\1\27\10\uffff\1\27"+
            "\15\uffff\2\27\1\uffff\3\27\4\uffff\2\27\106\uffff\2\27\5\uffff"+
            "\1\26",
            "\3\27\1\uffff\2\27\15\uffff\1\27\2\uffff\1\27\10\uffff\1\27"+
            "\15\uffff\2\27\1\uffff\3\27\4\uffff\2\27\106\uffff\2\27\5\uffff"+
            "\1\26",
            "\3\27\1\uffff\2\27\15\uffff\1\27\2\uffff\1\27\10\uffff\1\27"+
            "\15\uffff\2\27\1\uffff\3\27\4\uffff\2\27\106\uffff\2\27\5\uffff"+
            "\1\26",
            "\3\27\1\uffff\2\27\15\uffff\1\27\2\uffff\1\27\10\uffff\1\27"+
            "\15\uffff\2\27\1\uffff\3\27\4\uffff\2\27\106\uffff\2\27\5\uffff"+
            "\1\26",
            "\3\27\1\uffff\2\27\15\uffff\1\27\2\uffff\1\27\10\uffff\1\27"+
            "\15\uffff\2\27\1\uffff\3\27\4\uffff\2\27\106\uffff\2\27\5\uffff"+
            "\1\26",
            "\3\27\1\uffff\2\27\15\uffff\1\27\2\uffff\1\27\10\uffff\1\27"+
            "\15\uffff\2\27\1\uffff\3\27\4\uffff\2\27\106\uffff\2\27\5\uffff"+
            "\1\26",
            "\3\27\1\uffff\2\27\15\uffff\1\27\2\uffff\1\27\10\uffff\1\27"+
            "\15\uffff\2\27\1\uffff\3\27\4\uffff\2\27\106\uffff\2\27\5\uffff"+
            "\1\26",
            "\3\27\1\uffff\2\27\15\uffff\1\27\2\uffff\1\27\10\uffff\1\27"+
            "\15\uffff\2\27\1\uffff\3\27\4\uffff\2\27\106\uffff\2\27\5\uffff"+
            "\1\26",
            "\3\27\1\uffff\2\27\15\uffff\1\27\2\uffff\1\27\10\uffff\1\27"+
            "\15\uffff\2\27\1\uffff\3\27\4\uffff\2\27\106\uffff\2\27\5\uffff"+
            "\1\26",
            "\3\27\1\uffff\2\27\15\uffff\1\27\2\uffff\1\27\10\uffff\1\27"+
            "\15\uffff\2\27\1\uffff\3\27\4\uffff\2\27\106\uffff\2\27\5\uffff"+
            "\1\26",
            "\3\27\1\uffff\2\27\15\uffff\1\27\2\uffff\1\27\10\uffff\1\27"+
            "\15\uffff\2\27\1\uffff\3\27\4\uffff\2\27\106\uffff\2\27\5\uffff"+
            "\1\26",
            "\3\27\1\uffff\2\27\15\uffff\1\27\2\uffff\1\27\10\uffff\1\27"+
            "\15\uffff\2\27\1\uffff\3\27\4\uffff\2\27\106\uffff\2\27\5\uffff"+
            "\1\26",
            "\3\27\1\uffff\2\27\15\uffff\1\27\2\uffff\1\27\10\uffff\1\27"+
            "\15\uffff\2\27\1\uffff\3\27\4\uffff\2\27\106\uffff\2\27\5\uffff"+
            "\1\26",
            "\3\27\1\uffff\2\27\15\uffff\1\27\2\uffff\1\27\10\uffff\1\27"+
            "\15\uffff\2\27\1\uffff\3\27\4\uffff\2\27\106\uffff\2\27\5\uffff"+
            "\1\26",
            "\3\27\1\uffff\2\27\15\uffff\1\27\2\uffff\1\27\10\uffff\1\27"+
            "\15\uffff\2\27\1\uffff\3\27\4\uffff\2\27\106\uffff\2\27\5\uffff"+
            "\1\26",
            "\3\27\1\uffff\2\27\15\uffff\1\27\2\uffff\1\27\10\uffff\1\27"+
            "\15\uffff\2\27\1\uffff\3\27\4\uffff\2\27\106\uffff\2\27\5\uffff"+
            "\1\26",
            "\3\27\1\uffff\2\27\15\uffff\1\27\2\uffff\1\27\10\uffff\1\27"+
            "\15\uffff\2\27\1\uffff\3\27\4\uffff\2\27\106\uffff\2\27\5\uffff"+
            "\1\26",
            "",
            ""
    };

    static final short[] DFA83_eot = DFA.unpackEncodedString(DFA83_eotS);
    static final short[] DFA83_eof = DFA.unpackEncodedString(DFA83_eofS);
    static final char[] DFA83_min = DFA.unpackEncodedStringToUnsignedChars(DFA83_minS);
    static final char[] DFA83_max = DFA.unpackEncodedStringToUnsignedChars(DFA83_maxS);
    static final short[] DFA83_accept = DFA.unpackEncodedString(DFA83_acceptS);
    static final short[] DFA83_special = DFA.unpackEncodedString(DFA83_specialS);
    static final short[][] DFA83_transition;

    static {
        int numStates = DFA83_transitionS.length;
        DFA83_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA83_transition[i] = DFA.unpackEncodedString(DFA83_transitionS[i]);
        }
    }

    class DFA83 extends DFA {

        public DFA83(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 83;
            this.eot = DFA83_eot;
            this.eof = DFA83_eof;
            this.min = DFA83_min;
            this.max = DFA83_max;
            this.accept = DFA83_accept;
            this.special = DFA83_special;
            this.transition = DFA83_transition;
        }
        public String getDescription() {
            return "767:7: ( cfOrKsName[name, true] '.' )?";
        }
    }
    static final String DFA102_eotS =
        "\56\uffff";
    static final String DFA102_eofS =
        "\56\uffff";
    static final String DFA102_minS =
        "\1\6\24\u008d\1\6\2\uffff\24\22\2\uffff";
    static final String DFA102_maxS =
        "\1\146\24\u0094\1\u0092\2\uffff\24\u0095\2\uffff";
    static final String DFA102_acceptS =
        "\26\uffff\1\4\1\1\24\uffff\1\2\1\3";
    static final String DFA102_specialS =
        "\56\uffff}>";
    static final String[] DFA102_transitionS = {
            "\1\3\1\24\1\3\6\uffff\1\3\2\24\6\uffff\1\3\2\uffff\1\3\1\uffff"+
            "\1\17\5\uffff\1\10\6\uffff\1\3\1\uffff\5\3\1\uffff\1\1\2\uffff"+
            "\1\3\2\uffff\1\3\6\uffff\1\3\4\uffff\11\3\1\2\12\uffff\1\4\1"+
            "\5\1\6\1\7\1\11\1\12\1\13\1\14\1\15\1\16\1\20\1\21\1\22\1\23"+
            "\1\3",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\31\1\53\1\31\6\uffff\1\31\2\53\1\27\5\uffff\1\31\2\uffff"+
            "\1\31\1\uffff\1\45\5\uffff\1\36\6\uffff\1\31\1\uffff\5\31\1"+
            "\uffff\1\30\1\uffff\1\27\1\31\2\uffff\1\31\6\uffff\1\31\4\uffff"+
            "\11\31\1\52\11\27\1\uffff\1\32\1\33\1\34\1\35\1\37\1\40\1\41"+
            "\1\42\1\43\1\44\1\46\1\47\1\50\1\51\1\31\42\uffff\1\27\3\uffff"+
            "\1\27\2\uffff\3\27",
            "",
            "",
            "\1\55\166\uffff\1\27\6\uffff\1\54\4\uffff\1\54",
            "\1\55\166\uffff\1\27\6\uffff\1\54\4\uffff\1\54",
            "\1\55\166\uffff\1\27\6\uffff\1\54\4\uffff\1\54",
            "\1\55\166\uffff\1\27\6\uffff\1\54\4\uffff\1\54",
            "\1\55\166\uffff\1\27\6\uffff\1\54\4\uffff\1\54",
            "\1\55\166\uffff\1\27\6\uffff\1\54\4\uffff\1\54",
            "\1\55\166\uffff\1\27\6\uffff\1\54\4\uffff\1\54",
            "\1\55\166\uffff\1\27\6\uffff\1\54\4\uffff\1\54",
            "\1\55\166\uffff\1\27\6\uffff\1\54\4\uffff\1\54",
            "\1\55\166\uffff\1\27\6\uffff\1\54\4\uffff\1\54",
            "\1\55\166\uffff\1\27\6\uffff\1\54\4\uffff\1\54",
            "\1\55\166\uffff\1\27\6\uffff\1\54\4\uffff\1\54",
            "\1\55\166\uffff\1\27\6\uffff\1\54\4\uffff\1\54",
            "\1\55\166\uffff\1\27\6\uffff\1\54\4\uffff\1\54",
            "\1\55\166\uffff\1\27\6\uffff\1\54\4\uffff\1\54",
            "\1\55\166\uffff\1\27\6\uffff\1\54\4\uffff\1\54",
            "\1\55\166\uffff\1\27\6\uffff\1\54\4\uffff\1\54",
            "\1\55\166\uffff\1\27\6\uffff\1\54\4\uffff\1\54",
            "\1\55\175\uffff\1\54\4\uffff\1\54",
            "\1\55\175\uffff\1\54\4\uffff\1\54",
            "",
            ""
    };

    static final short[] DFA102_eot = DFA.unpackEncodedString(DFA102_eotS);
    static final short[] DFA102_eof = DFA.unpackEncodedString(DFA102_eofS);
    static final char[] DFA102_min = DFA.unpackEncodedStringToUnsignedChars(DFA102_minS);
    static final char[] DFA102_max = DFA.unpackEncodedStringToUnsignedChars(DFA102_maxS);
    static final short[] DFA102_accept = DFA.unpackEncodedString(DFA102_acceptS);
    static final short[] DFA102_special = DFA.unpackEncodedString(DFA102_specialS);
    static final short[][] DFA102_transition;

    static {
        int numStates = DFA102_transitionS.length;
        DFA102_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA102_transition[i] = DFA.unpackEncodedString(DFA102_transitionS[i]);
        }
    }

    class DFA102 extends DFA {

        public DFA102(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 102;
            this.eot = DFA102_eot;
            this.eof = DFA102_eof;
            this.min = DFA102_min;
            this.max = DFA102_max;
            this.accept = DFA102_accept;
            this.special = DFA102_special;
            this.transition = DFA102_transition;
        }
        public String getDescription() {
            return "846:1: columnOperation[List<Pair<ColumnIdentifier.Raw, Operation.RawUpdate>> operations] : (key= cident '=' t= term ( '+' c= cident )? | key= cident '=' c= cident sig= ( '+' | '-' ) t= term | key= cident '=' c= cident i= INTEGER | key= cident '[' k= term ']' '=' t= term );";
        }
    }
    static final String DFA103_eotS =
        "\27\uffff";
    static final String DFA103_eofS =
        "\27\uffff";
    static final String DFA103_minS =
        "\1\6\24\u008d\2\uffff";
    static final String DFA103_maxS =
        "\1\146\24\u0094\2\uffff";
    static final String DFA103_acceptS =
        "\25\uffff\1\1\1\2";
    static final String DFA103_specialS =
        "\27\uffff}>";
    static final String[] DFA103_transitionS = {
            "\1\3\1\24\1\3\6\uffff\1\3\2\24\6\uffff\1\3\2\uffff\1\3\1\uffff"+
            "\1\17\5\uffff\1\10\6\uffff\1\3\1\uffff\5\3\1\uffff\1\1\2\uffff"+
            "\1\3\2\uffff\1\3\6\uffff\1\3\4\uffff\11\3\1\2\12\uffff\1\4\1"+
            "\5\1\6\1\7\1\11\1\12\1\13\1\14\1\15\1\16\1\20\1\21\1\22\1\23"+
            "\1\3",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "",
            ""
    };

    static final short[] DFA103_eot = DFA.unpackEncodedString(DFA103_eotS);
    static final short[] DFA103_eof = DFA.unpackEncodedString(DFA103_eofS);
    static final char[] DFA103_min = DFA.unpackEncodedStringToUnsignedChars(DFA103_minS);
    static final char[] DFA103_max = DFA.unpackEncodedStringToUnsignedChars(DFA103_maxS);
    static final short[] DFA103_accept = DFA.unpackEncodedString(DFA103_acceptS);
    static final short[] DFA103_special = DFA.unpackEncodedString(DFA103_specialS);
    static final short[][] DFA103_transition;

    static {
        int numStates = DFA103_transitionS.length;
        DFA103_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA103_transition[i] = DFA.unpackEncodedString(DFA103_transitionS[i]);
        }
    }

    class DFA103 extends DFA {

        public DFA103(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 103;
            this.eot = DFA103_eot;
            this.eof = DFA103_eof;
            this.min = DFA103_min;
            this.max = DFA103_max;
            this.accept = DFA103_accept;
            this.special = DFA103_special;
            this.transition = DFA103_transition;
        }
        public String getDescription() {
            return "880:1: columnCondition[List<Pair<ColumnIdentifier.Raw, ColumnCondition.Raw>> conditions] : (key= cident '=' t= term | key= cident '[' element= term ']' '=' t= term );";
        }
    }
    static final String DFA110_eotS =
        "\61\uffff";
    static final String DFA110_eofS =
        "\61\uffff";
    static final String DFA110_minS =
        "\1\6\24\127\1\uffff\1\6\1\uffff\1\116\24\127\4\uffff";
    static final String DFA110_maxS =
        "\1\u0089\24\u0099\1\uffff\1\u0089\1\uffff\1\u0092\24\u0099\4\uffff";
    static final String DFA110_acceptS =
        "\25\uffff\1\2\1\uffff\1\1\25\uffff\1\6\1\3\1\4\1\5";
    static final String DFA110_specialS =
        "\61\uffff}>";
    static final String[] DFA110_transitionS = {
            "\1\3\1\24\1\3\6\uffff\1\3\2\24\6\uffff\1\3\2\uffff\1\3\1\uffff"+
            "\1\17\5\uffff\1\10\6\uffff\1\3\1\uffff\5\3\1\uffff\1\1\2\uffff"+
            "\1\3\2\uffff\1\3\6\uffff\1\3\4\uffff\11\3\1\2\10\uffff\1\25"+
            "\1\uffff\1\4\1\5\1\6\1\7\1\11\1\12\1\13\1\14\1\15\1\16\1\20"+
            "\1\21\1\22\1\23\1\3\42\uffff\1\26",
            "\1\30\74\uffff\1\27\1\uffff\4\27",
            "\1\30\74\uffff\1\27\1\uffff\4\27",
            "\1\30\74\uffff\1\27\1\uffff\4\27",
            "\1\30\74\uffff\1\27\1\uffff\4\27",
            "\1\30\74\uffff\1\27\1\uffff\4\27",
            "\1\30\74\uffff\1\27\1\uffff\4\27",
            "\1\30\74\uffff\1\27\1\uffff\4\27",
            "\1\30\74\uffff\1\27\1\uffff\4\27",
            "\1\30\74\uffff\1\27\1\uffff\4\27",
            "\1\30\74\uffff\1\27\1\uffff\4\27",
            "\1\30\74\uffff\1\27\1\uffff\4\27",
            "\1\30\74\uffff\1\27\1\uffff\4\27",
            "\1\30\74\uffff\1\27\1\uffff\4\27",
            "\1\30\74\uffff\1\27\1\uffff\4\27",
            "\1\30\74\uffff\1\27\1\uffff\4\27",
            "\1\30\74\uffff\1\27\1\uffff\4\27",
            "\1\30\74\uffff\1\27\1\uffff\4\27",
            "\1\30\74\uffff\1\27\1\uffff\4\27",
            "\1\30\74\uffff\1\27\1\uffff\4\27",
            "\1\30\74\uffff\1\27\1\uffff\4\27",
            "",
            "\1\33\1\54\1\33\6\uffff\1\33\2\54\6\uffff\1\33\2\uffff\1\33"+
            "\1\uffff\1\47\5\uffff\1\40\6\uffff\1\33\1\uffff\5\33\1\uffff"+
            "\1\31\2\uffff\1\33\2\uffff\1\33\6\uffff\1\33\4\uffff\11\33\1"+
            "\32\10\uffff\1\55\1\uffff\1\34\1\35\1\36\1\37\1\41\1\42\1\43"+
            "\1\44\1\45\1\46\1\50\1\51\1\52\1\53\1\33\42\uffff\1\55",
            "",
            "\1\56\72\uffff\1\57\10\uffff\1\56",
            "\1\55\62\uffff\2\60\10\uffff\1\55\1\uffff\4\55",
            "\1\55\62\uffff\2\60\10\uffff\1\55\1\uffff\4\55",
            "\1\55\62\uffff\2\60\10\uffff\1\55\1\uffff\4\55",
            "\1\55\62\uffff\2\60\10\uffff\1\55\1\uffff\4\55",
            "\1\55\62\uffff\2\60\10\uffff\1\55\1\uffff\4\55",
            "\1\55\62\uffff\2\60\10\uffff\1\55\1\uffff\4\55",
            "\1\55\62\uffff\2\60\10\uffff\1\55\1\uffff\4\55",
            "\1\55\62\uffff\2\60\10\uffff\1\55\1\uffff\4\55",
            "\1\55\62\uffff\2\60\10\uffff\1\55\1\uffff\4\55",
            "\1\55\62\uffff\2\60\10\uffff\1\55\1\uffff\4\55",
            "\1\55\62\uffff\2\60\10\uffff\1\55\1\uffff\4\55",
            "\1\55\62\uffff\2\60\10\uffff\1\55\1\uffff\4\55",
            "\1\55\62\uffff\2\60\10\uffff\1\55\1\uffff\4\55",
            "\1\55\62\uffff\2\60\10\uffff\1\55\1\uffff\4\55",
            "\1\55\62\uffff\2\60\10\uffff\1\55\1\uffff\4\55",
            "\1\55\62\uffff\2\60\10\uffff\1\55\1\uffff\4\55",
            "\1\55\62\uffff\2\60\10\uffff\1\55\1\uffff\4\55",
            "\1\55\62\uffff\2\60\10\uffff\1\55\1\uffff\4\55",
            "\1\55\62\uffff\2\60\10\uffff\1\55\1\uffff\4\55",
            "\1\55\62\uffff\2\60\10\uffff\1\55\1\uffff\4\55",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA110_eot = DFA.unpackEncodedString(DFA110_eotS);
    static final short[] DFA110_eof = DFA.unpackEncodedString(DFA110_eofS);
    static final char[] DFA110_min = DFA.unpackEncodedStringToUnsignedChars(DFA110_minS);
    static final char[] DFA110_max = DFA.unpackEncodedStringToUnsignedChars(DFA110_maxS);
    static final short[] DFA110_accept = DFA.unpackEncodedString(DFA110_acceptS);
    static final short[] DFA110_special = DFA.unpackEncodedString(DFA110_specialS);
    static final short[][] DFA110_transition;

    static {
        int numStates = DFA110_transitionS.length;
        DFA110_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA110_transition[i] = DFA.unpackEncodedString(DFA110_transitionS[i]);
        }
    }

    class DFA110 extends DFA {

        public DFA110(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 110;
            this.eot = DFA110_eot;
            this.eof = DFA110_eof;
            this.min = DFA110_min;
            this.max = DFA110_max;
            this.accept = DFA110_accept;
            this.special = DFA110_special;
            this.transition = DFA110_transition;
        }
        public String getDescription() {
            return "908:1: relation[List<Relation> clauses] : (name= cident type= relationType t= term | K_TOKEN l= tupleOfIdentifiers type= relationType t= term | name= cident K_IN marker= inMarker | name= cident K_IN inValues= singleColumnInValues | ids= tupleOfIdentifiers ( K_IN ( '(' ')' | tupleInMarker= inMarkerForTuple | literals= tupleOfTupleLiterals | markers= tupleOfMarkersForTuples ) | type= relationType literal= tupleLiteral | type= relationType tupleMarker= markerForTuple ) | '(' relation[$clauses] ')' );";
        }
    }
 

    public static final BitSet FOLLOW_cqlStatement_in_query72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_136_in_query75 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_EOF_in_query79 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectStatement_in_cqlStatement113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insertStatement_in_cqlStatement138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_updateStatement_in_cqlStatement163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_batchStatement_in_cqlStatement188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_deleteStatement_in_cqlStatement214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_useStatement_in_cqlStatement239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_truncateStatement_in_cqlStatement267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createKeyspaceStatement_in_cqlStatement290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createTableStatement_in_cqlStatement307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createIndexStatement_in_cqlStatement326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dropKeyspaceStatement_in_cqlStatement345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dropTableStatement_in_cqlStatement363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dropIndexStatement_in_cqlStatement384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterTableStatement_in_cqlStatement405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterKeyspaceStatement_in_cqlStatement425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_grantStatement_in_cqlStatement442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_revokeStatement_in_cqlStatement467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_listPermissionsStatement_in_cqlStatement491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createUserStatement_in_cqlStatement506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterUserStatement_in_cqlStatement526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dropUserStatement_in_cqlStatement547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_listUsersStatement_in_cqlStatement569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createTriggerStatement_in_cqlStatement590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dropTriggerStatement_in_cqlStatement607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_USE_in_useStatement639 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF007FF0L});
    public static final BitSet FOLLOW_keyspaceName_in_useStatement643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_SELECT_in_selectStatement677 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF403FF0L,0x0000000000001000L});
    public static final BitSet FOLLOW_K_DISTINCT_in_selectStatement683 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF403FF0L,0x0000000000001000L});
    public static final BitSet FOLLOW_selectClause_in_selectStatement692 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_K_COUNT_in_selectStatement712 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_137_in_selectStatement714 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_selectCountClause_in_selectStatement718 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_138_in_selectStatement720 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_K_AS_in_selectStatement725 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_ident_in_selectStatement729 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_K_FROM_in_selectStatement744 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF007FF0L});
    public static final BitSet FOLLOW_columnFamilyName_in_selectStatement748 = new BitSet(new long[]{0x0000000000006C02L});
    public static final BitSet FOLLOW_K_WHERE_in_selectStatement758 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF403FF0L,0x0000000000000200L});
    public static final BitSet FOLLOW_whereClause_in_selectStatement762 = new BitSet(new long[]{0x0000000000006802L});
    public static final BitSet FOLLOW_K_ORDER_in_selectStatement775 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_K_BY_in_selectStatement777 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_orderByClause_in_selectStatement779 = new BitSet(new long[]{0x0000000000006002L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_139_in_selectStatement784 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_orderByClause_in_selectStatement786 = new BitSet(new long[]{0x0000000000006002L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_K_LIMIT_in_selectStatement803 = new BitSet(new long[]{0x0000000000044000L,0x0000000000004000L,0x0000000000040000L});
    public static final BitSet FOLLOW_intValue_in_selectStatement807 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_K_ALLOW_in_selectStatement822 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_K_FILTERING_in_selectStatement824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selector_in_selectClause861 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_139_in_selectClause866 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF403FF0L});
    public static final BitSet FOLLOW_selector_in_selectClause870 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_140_in_selectClause882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaliasedSelector_in_selector915 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_K_AS_in_selector918 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_ident_in_selector922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_unaliasedSelector951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_WRITETIME_in_unaliasedSelector994 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_137_in_unaliasedSelector996 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_cident_in_unaliasedSelector1000 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_138_in_unaliasedSelector1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_TTL_in_unaliasedSelector1025 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_137_in_unaliasedSelector1033 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_cident_in_unaliasedSelector1037 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_138_in_unaliasedSelector1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionName_in_unaliasedSelector1064 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_selectionFunctionArgs_in_unaliasedSelector1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_selectionFunctionArgs1091 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_138_in_selectionFunctionArgs1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_selectionFunctionArgs1103 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF403FF0L});
    public static final BitSet FOLLOW_unaliasedSelector_in_selectionFunctionArgs1107 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_139_in_selectionFunctionArgs1123 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF403FF0L});
    public static final BitSet FOLLOW_unaliasedSelector_in_selectionFunctionArgs1127 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_138_in_selectionFunctionArgs1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_selectCountClause1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_selectCountClause1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relation_in_whereClause1222 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_K_AND_in_whereClause1226 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF403FF0L,0x0000000000000200L});
    public static final BitSet FOLLOW_relation_in_whereClause1228 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_cident_in_orderByClause1259 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_K_ASC_in_orderByClause1264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DESC_in_orderByClause1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_INSERT_in_insertStatement1306 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_K_INTO_in_insertStatement1308 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF007FF0L});
    public static final BitSet FOLLOW_columnFamilyName_in_insertStatement1312 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_137_in_insertStatement1324 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_cident_in_insertStatement1328 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_139_in_insertStatement1335 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_cident_in_insertStatement1339 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_138_in_insertStatement1346 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_K_VALUES_in_insertStatement1356 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_137_in_insertStatement1368 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000072200L});
    public static final BitSet FOLLOW_term_in_insertStatement1372 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_139_in_insertStatement1378 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000072200L});
    public static final BitSet FOLLOW_term_in_insertStatement1382 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_138_in_insertStatement1389 = new BitSet(new long[]{0x0000000012000002L});
    public static final BitSet FOLLOW_K_IF_in_insertStatement1402 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_K_NOT_in_insertStatement1404 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_K_EXISTS_in_insertStatement1406 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_usingClause_in_insertStatement1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_USING_in_usingClause1453 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_usingClauseObjective_in_usingClause1455 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_K_AND_in_usingClause1460 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_usingClauseObjective_in_usingClause1462 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_K_TIMESTAMP_in_usingClauseObjective1484 = new BitSet(new long[]{0x0000000000040000L,0x0000000000004000L,0x0000000000040000L});
    public static final BitSet FOLLOW_intValue_in_usingClauseObjective1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_TTL_in_usingClauseObjective1498 = new BitSet(new long[]{0x0000000000040000L,0x0000000000004000L,0x0000000000040000L});
    public static final BitSet FOLLOW_intValue_in_usingClauseObjective1502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_UPDATE_in_updateStatement1536 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF007FF0L});
    public static final BitSet FOLLOW_columnFamilyName_in_updateStatement1540 = new BitSet(new long[]{0x0000000090000000L});
    public static final BitSet FOLLOW_usingClause_in_updateStatement1550 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_K_SET_in_updateStatement1562 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_columnOperation_in_updateStatement1564 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_139_in_updateStatement1568 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_columnOperation_in_updateStatement1570 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_K_WHERE_in_updateStatement1581 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF403FF0L,0x0000000000000200L});
    public static final BitSet FOLLOW_whereClause_in_updateStatement1585 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_K_IF_in_updateStatement1595 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_updateConditions_in_updateStatement1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_columnCondition_in_updateConditions1640 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_K_AND_in_updateConditions1645 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_columnCondition_in_updateConditions1647 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_K_DELETE_in_deleteStatement1684 = new BitSet(new long[]{0x8125F408290383C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_deleteSelection_in_deleteStatement1690 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_K_FROM_in_deleteStatement1703 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF007FF0L});
    public static final BitSet FOLLOW_columnFamilyName_in_deleteStatement1707 = new BitSet(new long[]{0x0000000010000400L});
    public static final BitSet FOLLOW_usingClauseDelete_in_deleteStatement1717 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_K_WHERE_in_deleteStatement1729 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF403FF0L,0x0000000000000200L});
    public static final BitSet FOLLOW_whereClause_in_deleteStatement1733 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_K_IF_in_deleteStatement1743 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_K_EXISTS_in_deleteStatement1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_updateConditions_in_deleteStatement1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_deleteOp_in_deleteSelection1802 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_139_in_deleteSelection1817 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_deleteOp_in_deleteSelection1821 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_cident_in_deleteOp1848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_deleteOp1875 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_deleteOp1877 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000072200L});
    public static final BitSet FOLLOW_term_in_deleteOp1881 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_142_in_deleteOp1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_USING_in_usingClauseDelete1903 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_K_TIMESTAMP_in_usingClauseDelete1905 = new BitSet(new long[]{0x0000000000040000L,0x0000000000004000L,0x0000000000040000L});
    public static final BitSet FOLLOW_intValue_in_usingClauseDelete1909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_BEGIN_in_batchStatement1943 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_K_UNLOGGED_in_batchStatement1953 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_K_COUNTER_in_batchStatement1959 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_K_BATCH_in_batchStatement1972 = new BitSet(new long[]{0x0000002150400000L});
    public static final BitSet FOLLOW_usingClause_in_batchStatement1976 = new BitSet(new long[]{0x0000002140400000L});
    public static final BitSet FOLLOW_batchStatementObjective_in_batchStatement1996 = new BitSet(new long[]{0x0000002140400000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_136_in_batchStatement1998 = new BitSet(new long[]{0x0000002140400000L});
    public static final BitSet FOLLOW_K_APPLY_in_batchStatement2012 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_K_BATCH_in_batchStatement2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insertStatement_in_batchStatementObjective2045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_updateStatement_in_batchStatementObjective2058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_deleteStatement_in_batchStatementObjective2071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_CREATE_in_createKeyspaceStatement2106 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_K_KEYSPACE_in_createKeyspaceStatement2108 = new BitSet(new long[]{0x8125F4082B0381C0L,0x0000007FFF007FF0L});
    public static final BitSet FOLLOW_K_IF_in_createKeyspaceStatement2111 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_K_NOT_in_createKeyspaceStatement2113 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_K_EXISTS_in_createKeyspaceStatement2115 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF007FF0L});
    public static final BitSet FOLLOW_keyspaceName_in_createKeyspaceStatement2124 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_K_WITH_in_createKeyspaceStatement2132 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_properties_in_createKeyspaceStatement2134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_CREATE_in_createTableStatement2169 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_K_COLUMNFAMILY_in_createTableStatement2171 = new BitSet(new long[]{0x8125F4082B0381C0L,0x0000007FFF007FF0L});
    public static final BitSet FOLLOW_K_IF_in_createTableStatement2174 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_K_NOT_in_createTableStatement2176 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_K_EXISTS_in_createTableStatement2178 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF007FF0L});
    public static final BitSet FOLLOW_columnFamilyName_in_createTableStatement2193 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_cfamDefinition_in_createTableStatement2203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_cfamDefinition2222 = new BitSet(new long[]{0x8125FC08290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_cfamColumns_in_cfamDefinition2224 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_139_in_cfamDefinition2229 = new BitSet(new long[]{0x8125FC08290381C0L,0x0000007FFF003FF0L,0x0000000000000C00L});
    public static final BitSet FOLLOW_cfamColumns_in_cfamDefinition2231 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_138_in_cfamDefinition2238 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_K_WITH_in_cfamDefinition2248 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_cfamProperty_in_cfamDefinition2250 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_K_AND_in_cfamDefinition2255 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_cfamProperty_in_cfamDefinition2257 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ident_in_cfamColumns2283 = new BitSet(new long[]{0x8131F408A9008140L,0x0000007FFF001FF0L});
    public static final BitSet FOLLOW_comparatorType_in_cfamColumns2287 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_K_STATIC_in_cfamColumns2292 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_K_PRIMARY_in_cfamColumns2309 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_K_KEY_in_cfamColumns2311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_PRIMARY_in_cfamColumns2323 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_K_KEY_in_cfamColumns2325 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_137_in_cfamColumns2327 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L,0x0000000000000200L});
    public static final BitSet FOLLOW_pkDef_in_cfamColumns2329 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_139_in_cfamColumns2333 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_ident_in_cfamColumns2337 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_138_in_cfamColumns2344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_pkDef2364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_pkDef2374 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_ident_in_pkDef2380 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_139_in_pkDef2386 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_ident_in_pkDef2390 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_138_in_pkDef2397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_property_in_cfamProperty2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_COMPACT_in_cfamProperty2426 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_K_STORAGE_in_cfamProperty2428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_CLUSTERING_in_cfamProperty2438 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_K_ORDER_in_cfamProperty2440 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_K_BY_in_cfamProperty2442 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_137_in_cfamProperty2444 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_cfamOrdering_in_cfamProperty2446 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_139_in_cfamProperty2450 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_cfamOrdering_in_cfamProperty2452 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_138_in_cfamProperty2457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_cfamOrdering2485 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_K_ASC_in_cfamOrdering2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DESC_in_cfamOrdering2492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_CREATE_in_createIndexStatement2530 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_K_CUSTOM_in_createIndexStatement2533 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_K_INDEX_in_createIndexStatement2539 = new BitSet(new long[]{0x000C000002000000L});
    public static final BitSet FOLLOW_K_IF_in_createIndexStatement2542 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_K_NOT_in_createIndexStatement2544 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_K_EXISTS_in_createIndexStatement2546 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_IDENT_in_createIndexStatement2564 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_K_ON_in_createIndexStatement2568 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF007FF0L});
    public static final BitSet FOLLOW_columnFamilyName_in_createIndexStatement2572 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_137_in_createIndexStatement2574 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_cident_in_createIndexStatement2578 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_138_in_createIndexStatement2580 = new BitSet(new long[]{0x0000010010000002L});
    public static final BitSet FOLLOW_K_USING_in_createIndexStatement2591 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_createIndexStatement2595 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_K_WITH_in_createIndexStatement2610 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_properties_in_createIndexStatement2612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_CREATE_in_createTriggerStatement2646 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_K_TRIGGER_in_createTriggerStatement2648 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_IDENT_in_createTriggerStatement2653 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_K_ON_in_createTriggerStatement2656 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF007FF0L});
    public static final BitSet FOLLOW_columnFamilyName_in_createTriggerStatement2660 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_K_USING_in_createTriggerStatement2662 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_createTriggerStatement2666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DROP_in_dropTriggerStatement2697 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_K_TRIGGER_in_dropTriggerStatement2699 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_IDENT_in_dropTriggerStatement2704 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_K_ON_in_dropTriggerStatement2707 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF007FF0L});
    public static final BitSet FOLLOW_columnFamilyName_in_dropTriggerStatement2711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_ALTER_in_alterKeyspaceStatement2751 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_K_KEYSPACE_in_alterKeyspaceStatement2753 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF007FF0L});
    public static final BitSet FOLLOW_keyspaceName_in_alterKeyspaceStatement2757 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_K_WITH_in_alterKeyspaceStatement2767 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_properties_in_alterKeyspaceStatement2769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_ALTER_in_alterTableStatement2805 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_K_COLUMNFAMILY_in_alterTableStatement2807 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF007FF0L});
    public static final BitSet FOLLOW_columnFamilyName_in_alterTableStatement2811 = new BitSet(new long[]{0x06C0010000000000L});
    public static final BitSet FOLLOW_K_ALTER_in_alterTableStatement2825 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_cident_in_alterTableStatement2829 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_K_TYPE_in_alterTableStatement2831 = new BitSet(new long[]{0x8131F408A9008140L,0x0000007FFF001FF0L});
    public static final BitSet FOLLOW_comparatorType_in_alterTableStatement2835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_ADD_in_alterTableStatement2851 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_cident_in_alterTableStatement2857 = new BitSet(new long[]{0x8131F408A9008140L,0x0000007FFF001FF0L});
    public static final BitSet FOLLOW_comparatorType_in_alterTableStatement2861 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_K_STATIC_in_alterTableStatement2866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DROP_in_alterTableStatement2884 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_cident_in_alterTableStatement2889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_WITH_in_alterTableStatement2929 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_properties_in_alterTableStatement2932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_RENAME_in_alterTableStatement2965 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_cident_in_alterTableStatement3019 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_K_TO_in_alterTableStatement3021 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_cident_in_alterTableStatement3025 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_K_AND_in_alterTableStatement3046 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_cident_in_alterTableStatement3050 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_K_TO_in_alterTableStatement3052 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_cident_in_alterTableStatement3056 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_K_DROP_in_dropKeyspaceStatement3111 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_K_KEYSPACE_in_dropKeyspaceStatement3113 = new BitSet(new long[]{0x8125F4082B0381C0L,0x0000007FFF007FF0L});
    public static final BitSet FOLLOW_K_IF_in_dropKeyspaceStatement3116 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_K_EXISTS_in_dropKeyspaceStatement3118 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF007FF0L});
    public static final BitSet FOLLOW_keyspaceName_in_dropKeyspaceStatement3127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DROP_in_dropTableStatement3161 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_K_COLUMNFAMILY_in_dropTableStatement3163 = new BitSet(new long[]{0x8125F4082B0381C0L,0x0000007FFF007FF0L});
    public static final BitSet FOLLOW_K_IF_in_dropTableStatement3166 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_K_EXISTS_in_dropTableStatement3168 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF007FF0L});
    public static final BitSet FOLLOW_columnFamilyName_in_dropTableStatement3177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DROP_in_dropIndexStatement3211 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_K_INDEX_in_dropIndexStatement3213 = new BitSet(new long[]{0x0004000002000000L});
    public static final BitSet FOLLOW_K_IF_in_dropIndexStatement3216 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_K_EXISTS_in_dropIndexStatement3218 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_IDENT_in_dropIndexStatement3227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_TRUNCATE_in_truncateStatement3258 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF007FF0L});
    public static final BitSet FOLLOW_columnFamilyName_in_truncateStatement3262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_GRANT_in_grantStatement3287 = new BitSet(new long[]{0x00C0004000000020L,0x000000000000001CL});
    public static final BitSet FOLLOW_permissionOrAll_in_grantStatement3299 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_K_ON_in_grantStatement3307 = new BitSet(new long[]{0x8125F688290381C0L,0x0000007FFF007FF0L});
    public static final BitSet FOLLOW_resource_in_grantStatement3319 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_K_TO_in_grantStatement3327 = new BitSet(new long[]{0x0014000000000000L});
    public static final BitSet FOLLOW_username_in_grantStatement3339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_REVOKE_in_revokeStatement3370 = new BitSet(new long[]{0x00C0004000000020L,0x000000000000001CL});
    public static final BitSet FOLLOW_permissionOrAll_in_revokeStatement3382 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_K_ON_in_revokeStatement3390 = new BitSet(new long[]{0x8125F688290381C0L,0x0000007FFF007FF0L});
    public static final BitSet FOLLOW_resource_in_revokeStatement3402 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_K_FROM_in_revokeStatement3410 = new BitSet(new long[]{0x0014000000000000L});
    public static final BitSet FOLLOW_username_in_revokeStatement3422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_LIST_in_listPermissionsStatement3460 = new BitSet(new long[]{0x00C0004000000020L,0x000000000000001CL});
    public static final BitSet FOLLOW_permissionOrAll_in_listPermissionsStatement3472 = new BitSet(new long[]{0x0008000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_K_ON_in_listPermissionsStatement3482 = new BitSet(new long[]{0x8125F688290381C0L,0x0000007FFF007FF0L});
    public static final BitSet FOLLOW_resource_in_listPermissionsStatement3484 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_K_OF_in_listPermissionsStatement3499 = new BitSet(new long[]{0x0014000000000000L});
    public static final BitSet FOLLOW_username_in_listPermissionsStatement3501 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_K_NORECURSIVE_in_listPermissionsStatement3516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_permission3552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_ALL_in_permissionOrAll3601 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_K_PERMISSIONS_in_permissionOrAll3605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_permission_in_permissionOrAll3626 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_K_PERMISSION_in_permissionOrAll3630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dataResource_in_resource3658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_ALL_in_dataResource3681 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_K_KEYSPACES_in_dataResource3683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_KEYSPACE_in_dataResource3693 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF007FF0L});
    public static final BitSet FOLLOW_keyspaceName_in_dataResource3699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_COLUMNFAMILY_in_dataResource3711 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF007FF0L});
    public static final BitSet FOLLOW_columnFamilyName_in_dataResource3720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_CREATE_in_createUserStatement3760 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_K_USER_in_createUserStatement3762 = new BitSet(new long[]{0x0014000002000000L});
    public static final BitSet FOLLOW_K_IF_in_createUserStatement3765 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_K_NOT_in_createUserStatement3767 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_K_EXISTS_in_createUserStatement3769 = new BitSet(new long[]{0x0014000000000000L});
    public static final BitSet FOLLOW_username_in_createUserStatement3775 = new BitSet(new long[]{0x0000010000000002L,0x0000000000000600L});
    public static final BitSet FOLLOW_K_WITH_in_createUserStatement3785 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_userOptions_in_createUserStatement3787 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000600L});
    public static final BitSet FOLLOW_K_SUPERUSER_in_createUserStatement3801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_NOSUPERUSER_in_createUserStatement3807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_ALTER_in_alterUserStatement3852 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_K_USER_in_alterUserStatement3854 = new BitSet(new long[]{0x0014000000000000L});
    public static final BitSet FOLLOW_username_in_alterUserStatement3856 = new BitSet(new long[]{0x0000010000000002L,0x0000000000000600L});
    public static final BitSet FOLLOW_K_WITH_in_alterUserStatement3866 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_userOptions_in_alterUserStatement3868 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000600L});
    public static final BitSet FOLLOW_K_SUPERUSER_in_alterUserStatement3882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_NOSUPERUSER_in_alterUserStatement3888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DROP_in_dropUserStatement3933 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_K_USER_in_dropUserStatement3935 = new BitSet(new long[]{0x0014000002000000L});
    public static final BitSet FOLLOW_K_IF_in_dropUserStatement3938 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_K_EXISTS_in_dropUserStatement3940 = new BitSet(new long[]{0x0014000000000000L});
    public static final BitSet FOLLOW_username_in_dropUserStatement3946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_LIST_in_listUsersStatement3971 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_K_USERS_in_listUsersStatement3973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_userOption_in_userOptions3993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_PASSWORD_in_userOption4014 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_userOption4018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_cident4049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_NAME_in_cident4074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unreserved_keyword_in_cident4093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_ident4119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_NAME_in_ident4144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unreserved_keyword_in_ident4163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cfOrKsName_in_keyspaceName4196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cfOrKsName_in_columnFamilyName4230 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_143_in_columnFamilyName4233 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF007FF0L});
    public static final BitSet FOLLOW_cfOrKsName_in_columnFamilyName4237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_cfOrKsName4258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_NAME_in_cfOrKsName4283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unreserved_keyword_in_cfOrKsName4302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QMARK_in_cfOrKsName4312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_constant4337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_constant4349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_constant4368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_constant4389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UUID_in_constant4408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEXNUMBER_in_constant4430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_144_in_constant4448 = new BitSet(new long[]{0x0000000000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_set_in_constant4457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_145_in_map_literal4486 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x00000000000F2200L});
    public static final BitSet FOLLOW_term_in_map_literal4504 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_146_in_map_literal4506 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000072200L});
    public static final BitSet FOLLOW_term_in_map_literal4510 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080800L});
    public static final BitSet FOLLOW_139_in_map_literal4516 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000072200L});
    public static final BitSet FOLLOW_term_in_map_literal4520 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_146_in_map_literal4522 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000072200L});
    public static final BitSet FOLLOW_term_in_map_literal4526 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080800L});
    public static final BitSet FOLLOW_147_in_map_literal4542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_set_or_map4566 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000072200L});
    public static final BitSet FOLLOW_term_in_set_or_map4570 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_139_in_set_or_map4586 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000072200L});
    public static final BitSet FOLLOW_term_in_set_or_map4590 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_146_in_set_or_map4592 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000072200L});
    public static final BitSet FOLLOW_term_in_set_or_map4596 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_139_in_set_or_map4631 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000072200L});
    public static final BitSet FOLLOW_term_in_set_or_map4635 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_141_in_collection_literal4669 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000076200L});
    public static final BitSet FOLLOW_term_in_collection_literal4687 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004800L});
    public static final BitSet FOLLOW_139_in_collection_literal4693 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000072200L});
    public static final BitSet FOLLOW_term_in_collection_literal4697 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004800L});
    public static final BitSet FOLLOW_142_in_collection_literal4713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_145_in_collection_literal4723 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000072200L});
    public static final BitSet FOLLOW_term_in_collection_literal4727 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000C0800L});
    public static final BitSet FOLLOW_set_or_map_in_collection_literal4731 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_147_in_collection_literal4736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_145_in_collection_literal4754 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_147_in_collection_literal4756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_value4781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collection_literal_in_value4803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_NULL_in_value4813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_value4837 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_ident_in_value4841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QMARK_in_value4859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_intValue4905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_intValue4919 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_ident_in_intValue4923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QMARK_in_intValue4934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_functionName4967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unreserved_function_keyword_in_functionName5001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_TOKEN_in_functionName5011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_functionArgs5056 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_138_in_functionArgs5058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_functionArgs5068 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000072200L});
    public static final BitSet FOLLOW_term_in_functionArgs5072 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_139_in_functionArgs5088 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000072200L});
    public static final BitSet FOLLOW_term_in_functionArgs5092 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_138_in_functionArgs5106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_term5131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionName_in_term5168 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_functionArgs_in_term5172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_term5182 = new BitSet(new long[]{0x8131F408A9008140L,0x0000007FFF001FF0L});
    public static final BitSet FOLLOW_comparatorType_in_term5186 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_138_in_term5188 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000072200L});
    public static final BitSet FOLLOW_term_in_term5192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_columnOperation5215 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_148_in_columnOperation5217 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000072200L});
    public static final BitSet FOLLOW_term_in_columnOperation5221 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_149_in_columnOperation5224 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_cident_in_columnOperation5228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_columnOperation5249 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_148_in_columnOperation5251 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_cident_in_columnOperation5255 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000210000L});
    public static final BitSet FOLLOW_set_in_columnOperation5259 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000072200L});
    public static final BitSet FOLLOW_term_in_columnOperation5269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_columnOperation5287 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_148_in_columnOperation5289 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_cident_in_columnOperation5293 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_INTEGER_in_columnOperation5297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_columnOperation5315 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_columnOperation5317 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000072200L});
    public static final BitSet FOLLOW_term_in_columnOperation5321 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_142_in_columnOperation5323 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_148_in_columnOperation5325 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000072200L});
    public static final BitSet FOLLOW_term_in_columnOperation5329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_columnCondition5362 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_148_in_columnCondition5364 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000072200L});
    public static final BitSet FOLLOW_term_in_columnCondition5368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_columnCondition5380 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_columnCondition5382 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000072200L});
    public static final BitSet FOLLOW_term_in_columnCondition5386 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_142_in_columnCondition5388 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_148_in_columnCondition5390 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000072200L});
    public static final BitSet FOLLOW_term_in_columnCondition5394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_property_in_properties5415 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_K_AND_in_properties5419 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_property_in_properties5421 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ident_in_property5444 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_148_in_property5446 = new BitSet(new long[]{0x8131F408290781C0L,0x0000007FFF1F9FF0L,0x0000000000030000L});
    public static final BitSet FOLLOW_propertyValue_in_property5451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_literal_in_property5480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_propertyValue5508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unreserved_keyword_in_propertyValue5530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_148_in_relationType5553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_150_in_relationType5564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_151_in_relationType5575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_152_in_relationType5585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_relationType5596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_relation5618 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000003D00000L});
    public static final BitSet FOLLOW_relationType_in_relation5622 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000072200L});
    public static final BitSet FOLLOW_term_in_relation5626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_TOKEN_in_relation5636 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_tupleOfIdentifiers_in_relation5640 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000003D00000L});
    public static final BitSet FOLLOW_relationType_in_relation5644 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000072200L});
    public static final BitSet FOLLOW_term_in_relation5648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_relation5668 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_K_IN_in_relation5670 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0x0000000000040000L});
    public static final BitSet FOLLOW_inMarker_in_relation5674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_relation5694 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_K_IN_in_relation5696 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_singleColumnInValues_in_relation5700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleOfIdentifiers_in_relation5720 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L,0x0000000003D00000L});
    public static final BitSet FOLLOW_K_IN_in_relation5730 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0x0000000000040200L});
    public static final BitSet FOLLOW_137_in_relation5744 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_138_in_relation5746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inMarkerForTuple_in_relation5778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleOfTupleLiterals_in_relation5812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleOfMarkersForTuples_in_relation5846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationType_in_relation5888 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_tupleLiteral_in_relation5892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationType_in_relation5918 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0x0000000000040000L});
    public static final BitSet FOLLOW_markerForTuple_in_relation5922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_relation5952 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF403FF0L,0x0000000000000200L});
    public static final BitSet FOLLOW_relation_in_relation5954 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_138_in_relation5957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QMARK_in_inMarker5978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_inMarker5988 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_ident_in_inMarker5992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_tupleOfIdentifiers6024 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_cident_in_tupleOfIdentifiers6028 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_139_in_tupleOfIdentifiers6033 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_cident_in_tupleOfIdentifiers6037 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_138_in_tupleOfIdentifiers6043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_singleColumnInValues6073 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000072600L});
    public static final BitSet FOLLOW_term_in_singleColumnInValues6081 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_139_in_singleColumnInValues6086 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000072200L});
    public static final BitSet FOLLOW_term_in_singleColumnInValues6090 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_138_in_singleColumnInValues6099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_tupleLiteral6129 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000072200L});
    public static final BitSet FOLLOW_term_in_tupleLiteral6133 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_139_in_tupleLiteral6138 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000072200L});
    public static final BitSet FOLLOW_term_in_tupleLiteral6142 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_138_in_tupleLiteral6148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_tupleOfTupleLiterals6180 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_tupleLiteral_in_tupleOfTupleLiterals6184 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_139_in_tupleOfTupleLiterals6189 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_tupleLiteral_in_tupleOfTupleLiterals6193 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_138_in_tupleOfTupleLiterals6199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QMARK_in_markerForTuple6220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_markerForTuple6230 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_ident_in_markerForTuple6234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_tupleOfMarkersForTuples6266 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0x0000000000040000L});
    public static final BitSet FOLLOW_markerForTuple_in_tupleOfMarkersForTuples6270 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_139_in_tupleOfMarkersForTuples6275 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0x0000000000040000L});
    public static final BitSet FOLLOW_markerForTuple_in_tupleOfMarkersForTuples6279 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_138_in_tupleOfMarkersForTuples6285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QMARK_in_inMarkerForTuple6306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_inMarkerForTuple6316 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_ident_in_inMarkerForTuple6320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_native_type_in_comparatorType6345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collection_type_in_comparatorType6361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_comparatorType6373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_ASCII_in_native_type6402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_BIGINT_in_native_type6416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_BLOB_in_native_type6429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_BOOLEAN_in_native_type6444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_COUNTER_in_native_type6456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DECIMAL_in_native_type6468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DOUBLE_in_native_type6480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_FLOAT_in_native_type6493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_INET_in_native_type6507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_INT_in_native_type6522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_TEXT_in_native_type6538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_TIMESTAMP_in_native_type6553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_UUID_in_native_type6563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_VARCHAR_in_native_type6578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_VARINT_in_native_type6590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_TIMEUUID_in_native_type6603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_MAP_in_collection_type6627 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_150_in_collection_type6630 = new BitSet(new long[]{0x8131F408A9008140L,0x0000007FFF001FF0L});
    public static final BitSet FOLLOW_comparatorType_in_collection_type6634 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_139_in_collection_type6636 = new BitSet(new long[]{0x8131F408A9008140L,0x0000007FFF001FF0L});
    public static final BitSet FOLLOW_comparatorType_in_collection_type6640 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_152_in_collection_type6642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_LIST_in_collection_type6660 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_150_in_collection_type6662 = new BitSet(new long[]{0x8131F408A9008140L,0x0000007FFF001FF0L});
    public static final BitSet FOLLOW_comparatorType_in_collection_type6666 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_152_in_collection_type6668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_SET_in_collection_type6686 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_150_in_collection_type6689 = new BitSet(new long[]{0x8131F408A9008140L,0x0000007FFF001FF0L});
    public static final BitSet FOLLOW_comparatorType_in_collection_type6693 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_152_in_collection_type6695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_username0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unreserved_function_keyword_in_unreserved_keyword6753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_unreserved_keyword6769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_unreserved_function_keyword6804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_native_type_in_unreserved_function_keyword7104 = new BitSet(new long[]{0x0000000000000002L});

}