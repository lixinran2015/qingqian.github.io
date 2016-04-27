<map version="1.0.1">
<!-- To view this file, download free mind mapping software FreeMind from http://freemind.sourceforge.net -->
<node CREATED="1453543264575" ID="ID_233145058" MODIFIED="1453543279075" TEXT="Hive 1.2.1&#x642d;&#x5efa;">
<node CREATED="1453543336776" FOLDED="true" ID="ID_1839312437" MODIFIED="1453895271278" POSITION="right" TEXT="&#x57fa;&#x7840;&#x73af;&#x5883;">
<node CREATED="1453543343463" ID="ID_1228521701" MODIFIED="1453543384972" TEXT="&#x548c;&#x4e0a;&#x4e00;&#x7bc7; hadoop &#x76f8;&#x540c; http://www.jianshu.com/p/57ffe2e3a092"/>
</node>
<node CREATED="1453543387268" ID="ID_618851377" MODIFIED="1454245594108" POSITION="right" TEXT="&#x51c6;&#x5907;&#x5de5;&#x4f5c;">
<node CREATED="1453543420191" ID="ID_1036317544" MODIFIED="1453543425070" TEXT="&#x83b7;&#x53d6;&#x5b89;&#x88c5;&#x6587;&#x4ef6;">
<node CREATED="1453543489718" ID="ID_46396405" MODIFIED="1453543598297" TEXT="http://apache.fayea.com/hive/hive-1.2.1/apache-hive-1.2.1-bin.tar.gz "/>
</node>
<node CREATED="1453543600601" ID="ID_800167428" MODIFIED="1453543636872" TEXT="&#x4f9d;&#x8d56;MySQL">
<node CREATED="1453543640641" ID="ID_851330021" MODIFIED="1453543689740" TEXT="&#x56e0;&#x5f53;&#x524d;&#x64cd;&#x4f5c;&#x7cfb;&#x7edf;&#x4e3a;CentOS6">
<node CREATED="1453543694766" ID="ID_736056230" MODIFIED="1453543750450" TEXT="&#x53ef;&#x5b89;&#x88c5;mysql5.5"/>
</node>
<node CREATED="1453543755532" ID="ID_1120898548" MODIFIED="1453543786918" TEXT="&#x83b7;&#x53d6;&#xff1a;MySQL-client-5.5.46-1.linux2.6.x86_64.rpm &#x3001;MySQL-server-5.5.46-1.linux2.6.x86_64.rpm"/>
<node CREATED="1453543839820" ID="ID_1169707014" MODIFIED="1453543842644" TEXT="&#x5b89;&#x88c5;">
<node CREATED="1453543849555" ID="ID_1200724289" MODIFIED="1453543849555" TEXT="rpm -ivh MySQL-client-5.5.46-1.linux2.6.x86_64.rpm"/>
<node CREATED="1453543789396" ID="ID_874913155" MODIFIED="1453543859335" TEXT="rpm -ivh MySQL-server-5.5.46-1.linux2.6.x86_64.rpm"/>
</node>
<node CREATED="1453543862946" ID="ID_822595792" MODIFIED="1453543865998" TEXT="&#x542f;&#x52a8;">
<node CREATED="1453543815331" ID="ID_1458950100" MODIFIED="1453543831064" TEXT="service mysql start"/>
</node>
<node CREATED="1453543831704" ID="ID_1540096902" MODIFIED="1453543873150" TEXT="&#x8bbe;&#x7f6e;&#x5bc6;&#x7801;">
<node CREATED="1453543903337" ID="ID_1134809211" MODIFIED="1453543921723">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="rgb(0, 0, 0)" face="&#x5fae;&#x8f6f;&#x96c5;&#x9ed1;">/usr/bin/mysqladmin -uroot password '123456 </font>
    </p>
  </body>
</html></richcontent>
</node>
</node>
<node CREATED="1453543924344" ID="ID_5310927" MODIFIED="1453543936029" TEXT="&#x9a8c;&#x8bc1;&#x53ef;&#x7528;">
<node CREATED="1453543938832" ID="ID_993451415" MODIFIED="1453543946123" TEXT="mysql -uroot -p123456"/>
<node CREATED="1453543946954" ID="ID_1638732016" MODIFIED="1453543963285" TEXT="&#x80fd;&#x767b;&#x9646;&#x6210;&#x529f;"/>
</node>
<node CREATED="1453544367388" ID="ID_1791974333" MODIFIED="1453544378620" TEXT="&#x521b;&#x5efa;hive&#x5e93;">
<node CREATED="1453544400542" MODIFIED="1453544400542" TEXT="alter database hivemeta character set latin1;"/>
</node>
<node CREATED="1453544303594" ID="ID_1442129112" MODIFIED="1453544405102" TEXT="&#x8bbe;&#x7f6e;&#x8bbf;&#x95ee;&#x5bc6;&#x7801;">
<node CREATED="1453544315588" ID="ID_1985879212" MODIFIED="1453544360805" TEXT="grant all privileges on *.* to hive@&quot;%&quot; identified by &quot;123456&quot; with grant option; &#xa;flush privileges;"/>
</node>
</node>
</node>
<node CREATED="1453543956184" ID="ID_1615484181" MODIFIED="1453895326854" POSITION="right" TEXT="&#x6b63;&#x5f0f;&#x5b89;&#x88c5;">
<node CREATED="1453543971274" ID="ID_674233351" MODIFIED="1453543989350" TEXT="&#x8bbe;&#x7f6e;&#x73af;&#x5883;&#x53d8;&#x91cf;">
<node COLOR="#990000" CREATED="1452959666310" ID="37upcggi88kfmeph5fi8j1aj36" MODIFIED="1452960495765" STYLE="fork" TEXT="&#x8bbe;&#x7f6e;&#x6587;&#x4ef6; .bashrc">
<font NAME="SansSerif" SIZE="14"/>
</node>
<node COLOR="#990000" CREATED="1452959666310" ID="73edureu1gvf3u9h16j317m483" MODIFIED="1453544069871" STYLE="fork" TEXT="export HIVE_HOME=/home/hadoop/bigdata/hive&#xa;export PATH=$HIVE_HOME/bin:$PATH">
<font NAME="SansSerif" SIZE="14"/>
<node COLOR="#111111" CREATED="1452959666310" ID="1igc45rikcgq8qj6i0vmfretnd" MODIFIED="1453544089357" STYLE="fork" TEXT="HIVE_HOME &#x8868;&#x793a;HIVE&#x5b89;&#x88c5;&#x76ee;&#x5f55;"/>
</node>
<node COLOR="#990000" CREATED="1452959666310" ID="03jhs12ofugfjdjo3p63tnp89f" MODIFIED="1452960495766" STYLE="fork" TEXT="source .bashrc">
<font NAME="SansSerif" SIZE="14"/>
</node>
<node COLOR="#990000" CREATED="1452959666311" ID="58mk2ubb0feg8sunekq8nvqehs" MODIFIED="1453544096863" STYLE="fork" TEXT="&#x9a8c;&#x8bc1;">
<font NAME="SansSerif" SIZE="14"/>
<node COLOR="#111111" CREATED="1452959666311" ID="06g568ee4jmf6lhkrjdgbk9td9" MODIFIED="1453544111666" STYLE="fork" TEXT="[hadoop@master ~]$ echo $HIVE_HOME&#xd;&#xa;/home/hadoop/bigdata/hive"/>
</node>
<node COLOR="#990000" CREATED="1452959666311" ID="0mpa25tujnh3uo8otnb40je6nr" MODIFIED="1453544121787" STYLE="fork" TEXT="&#x62f7;&#x8d1d;&#x5230;slave&#x673a;&#x5668;">
<font NAME="SansSerif" SIZE="14"/>
<node COLOR="#111111" CREATED="1452959666311" ID="730nb5bt124spq4ov23iqc9fr2" MODIFIED="1452960495767" STYLE="fork" TEXT="scp .bashrc hadoop@192.168.0.167:/home/hadoop/"/>
<node COLOR="#111111" CREATED="1452959666311" ID="3893iepug528sm0dpge4sir0pe" MODIFIED="1452960495768" STYLE="fork" TEXT="scp .bashrc hadoop@192.168.0.168:/home/hadoop/"/>
</node>
<node COLOR="#cc6600" CREATED="1453544138437" ID="ID_1762363433" MODIFIED="1453544233414" TEXT="&#x9a8c;&#x8bc1;slave">
<node CREATED="1453544152788" ID="ID_1850229772" MODIFIED="1453544162684" TEXT="&#x65b9;&#x6cd5;&#x540c;master&#x7aef;"/>
</node>
</node>
<node CREATED="1453544240163" ID="ID_1521460459" MODIFIED="1453895329934" TEXT="&#x914d;&#x7f6e;hive">
<node CREATED="1453544474003" ID="ID_1715421676" MODIFIED="1453544486818" TEXT="&#x5b89;&#x88c5;&#x76ee;&#x5f55;">
<node CREATED="1453544490298" ID="ID_1966786744" MODIFIED="1453544573143">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      cd /home/hadoop/bigdata/<br />tar -zxf apache-hive-1.2.1-bin.tar.gz
    </p>
    <p>
      mv apache-hive-1.2.1-bin hive<br />
    </p>
  </body>
</html></richcontent>
</node>
</node>
<node CREATED="1453544675106" ID="ID_1219907020" MODIFIED="1453544680304" TEXT="hive-sitv&#x914d;&#x7f6e;">
<node CREATED="1453544660261" ID="ID_718405105" MODIFIED="1453544792817">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      cd /home/hadoop/bigdata/hive/conf
    </p>
    <p>
      cp hive-default.xml.template hive-site.xml<br />
    </p>
  </body>
</html></richcontent>
</node>
<node CREATED="1453544685245" FOLDED="true" ID="ID_461034252" MODIFIED="1453551895416" TEXT="&#x4fee;&#x6539;&#x7684;&#x5185;&#x5bb9;">
<node CREATED="1453550091228" ID="ID_243040310" MODIFIED="1453551563804" TEXT="&lt;property&gt; &#xa;&lt;name&gt;hive.metastore.warehouse.dir&lt;/name&gt;        &#xa;&lt;value&gt;hdfs://master:9000/hive/warehouse&lt;/value&gt;    &#xa;&lt;/property&gt; &#xa;&lt;property&gt;   &#xa;&lt;name&gt;hive.exec.scratchdir&lt;/name&gt;        &#xa;&lt;value&gt;hdfs://master:9000/hive/scratchdir&lt;/value&gt;    &#xa;&lt;/property&gt; &#xa;&lt;property&gt;&#xa; &lt;name&gt;hive.metastore.warehouse.dir&lt;/name&gt;&#xa;&lt;value&gt;/home/hadoop/bigdata/hive/warehouse&lt;/value&gt; &#xa;&lt;/property&gt;    &#xa;&lt;property&gt;      &#xa; &lt;name&gt;hive.querylog.location&lt;/name&gt;        &#xa;&lt;value&gt;/home/hadoop/bigdata/hive/logs&lt;/value&gt;    &#xa;&lt;/property&gt;  &#xa;&lt;property&gt; &#xa;&lt;name&gt;javax.jdo.option.ConnectionURL&lt;/name&gt; &lt;value&gt;jdbc:mysql://master:3306/hivemeta?createDatabaseIfNotExist=true&lt;/value&gt;    &#xa;&lt;/property&gt;  &#xa;&lt;property&gt;        &#xa;&lt;name&gt;javax.jdo.option.ConnectionDriverName&lt;/name&gt;        &#xa;&lt;value&gt;com.mysql.jdbc.Driver&lt;/value&gt;    &#xa;&lt;/property&gt;  &#xa;&lt;property&gt;    &#xa;&lt;name&gt;javax.jdo.option.ConnectionUserName&lt;/name&gt;      &#xa;&lt;value&gt;hive&lt;/value&gt;   &#xa;&lt;/property&gt; &#xa;&lt;property&gt;        &#xa;&lt;name&gt;javax.jdo.option.ConnectionPassword&lt;/name&gt;        &#xa;&lt;value&gt;123456&lt;/value&gt;    &#xa;&lt;/property&gt; &#xa;&lt;property&gt;       &#xa;&lt;name&gt;hive.aux.jars.path&lt;/name&gt;&#xa;&lt;value&gt;file:///home/hadoop/bigdata/hive/lib/hive-hbase-handler-1.2.1.jar , file:///home/hadoop/bigdata/hive/lib/protobuf-java-2.5.0.jar, file:///home/hadoop/bigdata/hive/lib/hbase-client-1.0.1.1.jar, file:///home/hadoop/bigdata/hive/lib/hbase-common-1.0.1.1.jar, file:///home/hadoop/bigdata/hive/lib/zookeeper-3.4.6.jar, file:///home/hadoop/bigdata/hive/lib/guava-14.0.1.jar&lt;/value&gt;    &#xa;&lt;/property&gt; &lt;property&gt;        &#xa;&lt;name&gt;hive.metastore.local&lt;/name&gt;        &#xa;&lt;value&gt;true&lt;/value&gt;    &#xa;&lt;/property&gt;&#xa; &lt;property&gt; &#xa;&lt;name&gt;hive.metastore.uris&lt;/name&gt;&#xa;&lt;value&gt;thrift://master:9083,thrift://slave01:9083,thrift://slave02:9083&lt;/value&gt;    &#xa;&lt;/property&gt;"/>
</node>
</node>
<node CREATED="1453544713936" ID="ID_1034762912" MODIFIED="1453544718753" TEXT="hive-env&#x914d;&#x7f6e;">
<node CREATED="1453544660266" ID="ID_1851351972" MODIFIED="1453544807311">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      cd /home/hadoop/bigdata/hive/conf<br />cp hive-env.sh.template hive-env.sh
    </p>
  </body>
</html></richcontent>
<node CREATED="1453550351162" ID="ID_381645430" MODIFIED="1453550365964" TEXT="export HADOOP_HOME=/home/hadoop/bigdata/hadoop &#xa;export HIVE_CONF_DIR=/home/hadoop/bigdata/hive/conf "/>
</node>
</node>
<node CREATED="1453544722873" ID="ID_77234189" MODIFIED="1453544731287" TEXT="hive-log4j&#x914d;&#x7f6e;">
<node CREATED="1453544660264" ID="ID_1047196465" MODIFIED="1453544839110">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      cd /home/hadoop/bigdata/hive/conf<br />cp hive-log4j.properties.template hive-log4j.properties
    </p>
  </body>
</html></richcontent>
<node CREATED="1453550432089" ID="ID_183356000" MODIFIED="1453550451241">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      hive.log.threshold=ALL
    </p>
    <p>
      hive.root.logger=INFO,DRFA
    </p>
    <p>
      hive.log.dir=/home/hadoop/bigdata/hive/log
    </p>
    <p>
      hive.log.file=hive.log
    </p>
  </body>
</html></richcontent>
</node>
</node>
</node>
<node CREATED="1453550926913" ID="ID_1184094040" MODIFIED="1453550930083" TEXT="hive-config&#x914d;&#x7f6e;">
<node CREATED="1453550932828" ID="ID_500451902" MODIFIED="1453551020006">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      cd /home/hadoop/bigdata/hive/bin
    </p>
    <p>
      export JAVA_HOME=/usr/java/jdk1.8.0_60
    </p>
    <p>
      export HADOOP_HOME=/home/hadoop/bigdata/hadoop
    </p>
    <p>
      export HIVE_HOME=/home/hadoop/bigdata/hive<br />
    </p>
  </body>
</html></richcontent>
</node>
</node>
<node CREATED="1453549684032" ID="ID_404420449" MODIFIED="1453550846310" TEXT="&#x521b;&#x5efa;&#x76ee;&#x5f55;&#xff0c;&#x5e76;&#x8d4b;&#x6743;">
<node CREATED="1453550852643" ID="ID_1539234708" MODIFIED="1453550897886" TEXT="hdfs dfs -mkdir /hive  &#xa;hdfs dfs -mkdir /hive/scratchdir  &#xa;hdfs dfs -mkdir /hive/warehouse  &#xa;hdfs dfs -chmod g+w /hive/scratchdir  &#xa;hdfs dfs -chmod g+w /hive/warehouse &#xa;mkdir -p /home/hadoop/bigdata/hive/warehouse  &#xa;mkdir -p /home/hadoop/bigdata/hive/logs  &#xa;ssh slave01 mkdir -p /home/hadoop/bigdata/hive/warehouse  &#xa;ssh slave01 mkdir -p /home/hadoop/bigdata/hive/logs  &#xa;ssh slave02 mkdir -p /home/hadoop/bigdata/hive/warehouse &#xa;ssh slave02 mkdir -p /home/hadoop/bigdata/hive/logs"/>
</node>
</node>
<node CREATED="1453544433345" ID="ID_1014624123" MODIFIED="1453551128384" TEXT="&#x542f;&#x52a8;&amp;&#x9a8c;&#x8bc1;">
<node CREATED="1453551131426" ID="ID_436636879" MODIFIED="1453551133090" TEXT="&#x542f;&#x52a8;">
<node CREATED="1453551135906" ID="ID_445190850" MODIFIED="1453551145197" TEXT="nohup hive --service metastore -v &amp;"/>
<node CREATED="1453551145705" ID="ID_485087699" MODIFIED="1453551147678" TEXT="hive"/>
</node>
<node CREATED="1453551149576" ID="ID_1375049073" MODIFIED="1453551155069" TEXT="&#x9a8c;&#x8bc1;">
<node CREATED="1453551157701" ID="ID_740039110" MODIFIED="1453551182121" TEXT="create table hive_test(id int,name string)"/>
<node CREATED="1453551195732" ID="ID_741952377" MODIFIED="1453551247737">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      show tables;<br />hive_test
    </p>
    <p>
      Time taken: 1.87 seconds, Fetched: 1 row(s)<br />
    </p>
  </body>
</html></richcontent>
</node>
</node>
</node>
</node>
<node CREATED="1453551257022" FOLDED="true" ID="ID_584996285" MODIFIED="1453895267438" POSITION="right" TEXT="&#x9047;&#x5230;&#x9519;&#x8bef;">
<node CREATED="1453542207040" ID="ID_466075677" MODIFIED="1453542235743">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <div id="page">
      <div id="content" class="clearfix">
        <div id="main">
          <div class="blog_main">
            <div id="blog_content" class="blog_content">
              <div style="font-size: 14px" class="iteye-blog-content-contain">
                <div class="dp-highlighter">
                  <p>
                    <font size="3">Unable&#160;to&#160;instantiate&#160;org.apache.hadoop.hive.metastore.HiveMetaStoreClient&#160;&#160;</font>
                  </p>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </body>
</html></richcontent>
<node CREATED="1453542274916" ID="ID_1584142271" MODIFIED="1453542300822" TEXT="1&#xff09;mysql jdbc&#x9a71;&#x52a8; &#x662f;&#x5426;&#x653e;&#x5728;hive/lib "/>
<node CREATED="1453542301221" ID="ID_594274822" MODIFIED="1453542355165" TEXT="2&#xff09;&#x68c0;&#x67e5;user&#x8868;&#x4e2d;&#x662f;&#x5426;&#x6709; &#x7a7a;&#x8bb0;&#x5f55;&#xff0c;&#x5148;&#x5220;&#x9664;&#xff0c;&#x7136;&#x540e;flush privileges"/>
<node CREATED="1453542560411" ID="ID_404631094" MODIFIED="1453542571162" TEXT="3&#xff09;hive-site.xml &#x914d;&#x7f6e;&#x662f;&#x5426;&#x6b63;&#x786e;"/>
</node>
<node CREATED="1453541854778" ID="ID_864845069" MODIFIED="1453541929936" TEXT="Exception in thread &quot;main&quot; java.lang.RuntimeException: java.lang.RuntimeException: The root scratch dir: hdfs://master:9000/hive/scratchdir on HDFS should be writable. Current permissions are: rwxr-xr-">
<node CREATED="1453542141401" ID="ID_1049414164" MODIFIED="1453542148036" TEXT="hadoop fs -chmod -R 777 /hive/scratchdir"/>
</node>
<node CREATED="1453541933309" ID="ID_1017465143" MODIFIED="1453541954314" TEXT="Exception in thread &quot;main&quot;java.lang.RuntimeException: java.lang.IllegalArgumentException:java.net.URISyntaxException: Relative path in absolute URI:${system:java.io.tmpdir%7D/$%7Bsystem:user.name%7D">
<node CREATED="1453541974144" ID="ID_1340270905" MODIFIED="1453541976675" TEXT="hive.querylog.location"/>
<node CREATED="1453541977879" ID="ID_684865408" MODIFIED="1453541990270" TEXT="hive.exec.local.scratchdir"/>
<node CREATED="1453541992917" ID="ID_170870787" MODIFIED="1453542013058" TEXT="hive.downloaded.resources.dir"/>
<node CREATED="1453551356974" ID="ID_1905662561" MODIFIED="1453551369365" TEXT="&#x4e09;&#x4e2a;&#x503c;&#x5199;&#x6210;&#x7edd;&#x5bf9;&#x503c;"/>
</node>
<node CREATED="1453542060425" ID="ID_1585906237" MODIFIED="1453542079956" TEXT="NestedThrowablesStackTrace: com.mysql.jdbc.exceptions.jdbc4.MySQLSyntaxErrorException: Specified key was too long; max key length is 767 bytes ">
<node CREATED="1453542719960" ID="ID_1376376001" MODIFIED="1453542719960" TEXT="alter database hive character set latin1;"/>
<node CREATED="1453542083175" ID="ID_565356535" MODIFIED="1453542096175" TEXT="create table hive_test(id int,name string)"/>
</node>
</node>
</node>
</map>
