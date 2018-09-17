class org.accordproject.sample.corda.iou.IOUContract {
  public JsonElement main(Inheritance inheritance, JsonElement context) {
    final JsonElement vletvar$contract_0$21;
    { // new scope introduced for a let statement
      final JsonElement vcontract_0 = UnaryOperators.dot("contract", context);
    final JsonElement vletvar$now_0$20;
    { // new scope introduced for a let statement
      final JsonElement vnow_0 = UnaryOperators.dot("now", context);
    final JsonElement vletvar$request$19;
    { // new scope introduced for a let statement
      final JsonElement vrequest = UnaryOperators.dot("request", context);
    final JsonElement vletvar$emit_0$18;
    { // new scope introduced for a let statement
      final JsonElement vemit_0 = UnaryOperators.dot("emit", context);
    final JsonElement vletvar$state_0$17;
    { // new scope introduced for a let statement
      final JsonElement vstate_0 = UnaryOperators.dot("state", context);
    final JsonElement vletvar$lstate_0$16;
    { // new scope introduced for a let statement
      final JsonElement vlstate_0 = vstate;
    final JsonElement vletvar$lemit_0$15;
    { // new scope introduced for a let statement
      final JsonElement vlemit_0 = vemit;
    final JsonElement vletvar$X$match0$14;
    { // new scope introduced for a let statement
      final JsonElement vX$match0 = vrequest;
    final JsonElement res1;
    if (RuntimeUtils.either(UnaryOperators.cast(inheritance, new RuntimeUtils.CollectionBuilder<String>(1).add("org.accordproject.sample.corda.iou.IOURequest").result(), vX$match0))) {
      final JsonElement vX$case0
       = RuntimeUtils.toLeft(UnaryOperators.cast(inheritance, new RuntimeUtils.CollectionBuilder<String>(1).add("org.accordproject.sample.corda.iou.IOURequest").result(), vX$match0));
      res1 = UnaryOperators.left(UnaryOperators.rec("$main", vX$case0));
    } else {
      final JsonElement vX$case1
       = RuntimeUtils.toRight(UnaryOperators.cast(inheritance, new RuntimeUtils.CollectionBuilder<String>(1).add("org.accordproject.sample.corda.iou.IOURequest").result(), vX$match0));
      res1 = UnaryOperators.right(JsonNull.INSTANCE);
    }
    final JsonElement res13;
    if (RuntimeUtils.either(res1)) {
      final JsonElement vX$case0_0
       = RuntimeUtils.toLeft(res1);
      final JsonElement vletvar$X$case0$12;
      { // new scope introduced for a let statement
        final JsonElement vX$case0 = vX$case0_0;
      final JsonElement vletvar$X$main$11;
      { // new scope introduced for a let statement
        final JsonElement vX$main = UnaryOperators.dot("$main", vX$case0);
      final JsonElement vletvar$now$10;
      { // new scope introduced for a let statement
        final JsonElement vnow = vnow;
      final JsonElement vletvar$contract$9;
      { // new scope introduced for a let statement
        final JsonElement vcontract = vcontract;
      final JsonElement vletvar$state$8;
      { // new scope introduced for a let statement
        final JsonElement vstate = vlstate_0;
      final JsonElement vletvar$emit$7;
      { // new scope introduced for a let statement
        final JsonElement vemit = vlemit_0;
      final JsonElement vletvar$tx$6;
      { // new scope introduced for a let statement
        final JsonElement vtx = vX$main;
      final JsonElement vletvar$lstate$5;
      { // new scope introduced for a let statement
        final JsonElement vlstate = vstate;
      final JsonElement vletvar$lemit$4;
      { // new scope introduced for a let statement
        final JsonElement vlemit = vemit;
      final JsonElement t3;
      if (RuntimeUtils.asBoolean(UnaryOperators.neg(UnaryOperators.neg(BinaryOperators.equals(UnaryOperators.dot("lender", UnaryOperators.unbrand(vcontract)), UnaryOperators.dot("borrower", UnaryOperators.unbrand(vcontract))))))) {
        t3 = UnaryOperators.right(UnaryOperators.brand(new RuntimeUtils.CollectionBuilder<String>(1).add("org.accordproject.ergo.stdlib.ErgoErrorResponse").result(), UnaryOperators.rec("message", new JsonPrimitive("The lender and the borrower cannot be the same entity."))));
      } else {
        final JsonElement t2;
        if (RuntimeUtils.asBoolean(UnaryOperators.neg(UnaryOperators.neg(BinaryOperators.le(UnaryOperators.dot("value", UnaryOperators.unbrand(vtx)), new RuntimeUtils.JsonObjectBuilder().add("nat", new JsonPrimitive(0)).toJsonObject()))))) {
          t2 = UnaryOperators.right(UnaryOperators.brand(new RuntimeUtils.CollectionBuilder<String>(1).add("org.accordproject.ergo.stdlib.ErgoErrorResponse").result(), UnaryOperators.rec("message", new JsonPrimitive("The IOU's value must be non-negative."))));
        } else {
          t2 = UnaryOperators.left(BinaryOperators.concat(BinaryOperators.concat(UnaryOperators.rec("response", UnaryOperators.brand(new RuntimeUtils.CollectionBuilder<String>(1).add("org.accordproject.cicero.runtime.Response").result(), new RuntimeUtils.JsonObjectBuilder().toJsonObject())), UnaryOperators.rec("state", vlstate)), UnaryOperators.rec("emit", vlemit)));
        }
        t3 = t2;
      }
        vletvar$lemit$4 = t3;
      }
        vletvar$lstate$5 = vletvar$lemit$4;
      }
        vletvar$tx$6 = vletvar$lstate$5;
      }
        vletvar$emit$7 = vletvar$tx$6;
      }
        vletvar$state$8 = vletvar$emit$7;
      }
        vletvar$contract$9 = vletvar$state$8;
      }
        vletvar$now$10 = vletvar$contract$9;
      }
        vletvar$X$main$11 = vletvar$now$10;
      }
        vletvar$X$case0$12 = vletvar$X$main$11;
      }
      res13 = vletvar$X$case0$12;
    } else {
      final JsonElement vX$case1
       = RuntimeUtils.toRight(res1);
      res13 = UnaryOperators.right(new RuntimeUtils.JsonObjectBuilder().add("data", new RuntimeUtils.JsonObjectBuilder().add("message", new JsonPrimitive("DefaultMatch Error at lib/logic.ergo 19:0-29:1 ''")).toJsonObject()).add("type", RuntimeUtils.createJsonArray(new JsonPrimitive("org.accordproject.ergo.stdlib.ErgoErrorResponse"))).toJsonObject());
    }
      vletvar$X$match0$14 = res13;
    }
      vletvar$lemit_0$15 = vletvar$X$match0$14;
    }
      vletvar$lstate_0$16 = vletvar$lemit_0$15;
    }
      vletvar$state_0$17 = vletvar$lstate_0$16;
    }
      vletvar$emit_0$18 = vletvar$state_0$17;
    }
      vletvar$request$19 = vletvar$emit_0$18;
    }
      vletvar$now_0$20 = vletvar$request$19;
    }
      vletvar$contract_0$21 = vletvar$now_0$20;
    }
    return vletvar$contract_0$21;
  }

  public JsonElement init(Inheritance inheritance, JsonElement context) {
    final JsonElement vletvar$emit$5;
    { // new scope introduced for a let statement
      final JsonElement vemit = UnaryOperators.dot("emit", context);
    final JsonElement vletvar$state$4;
    { // new scope introduced for a let statement
      final JsonElement vstate = UnaryOperators.dot("state", context);
    final JsonElement vletvar$lstate_0$3;
    { // new scope introduced for a let statement
      final JsonElement vlstate_0 = vstate;
    final JsonElement vletvar$lemit$2;
    { // new scope introduced for a let statement
      final JsonElement vlemit = vemit;
    final JsonElement vletvar$lstate$1;
    { // new scope introduced for a let statement
      final JsonElement vlstate = UnaryOperators.brand(new RuntimeUtils.CollectionBuilder<String>(1).add("org.accordproject.cicero.contract.AccordContractState").result(), new RuntimeUtils.JsonObjectBuilder().add("stateId", new JsonPrimitive("1")).toJsonObject());
      vletvar$lstate$1 = UnaryOperators.left(BinaryOperators.concat(BinaryOperators.concat(UnaryOperators.rec("response", JsonNull.INSTANCE), UnaryOperators.rec("state", vlstate)), UnaryOperators.rec("emit", vlemit)));
    }
      vletvar$lemit$2 = vletvar$lstate$1;
    }
      vletvar$lstate_0$3 = vletvar$lemit$2;
    }
      vletvar$state$4 = vletvar$lstate_0$3;
    }
      vletvar$emit$5 = vletvar$state$4;
    }
    return vletvar$emit$5;
  }

  public JsonElement verify(Inheritance inheritance, JsonElement context) {
    final JsonElement vletvar$tx$9;
    { // new scope introduced for a let statement
      final JsonElement vtx = UnaryOperators.dot("tx", context);
    final JsonElement vletvar$contract_0$8;
    { // new scope introduced for a let statement
      final JsonElement vcontract_0 = UnaryOperators.dot("contract", context);
    final JsonElement vletvar$contract$7;
    { // new scope introduced for a let statement
      final JsonElement vcontract = UnaryOperators.dot("contract", context);
    final JsonElement vletvar$emit$6;
    { // new scope introduced for a let statement
      final JsonElement vemit = UnaryOperators.dot("emit", context);
    final JsonElement vletvar$state$5;
    { // new scope introduced for a let statement
      final JsonElement vstate = UnaryOperators.dot("state", context);
    final JsonElement vletvar$lstate$4;
    { // new scope introduced for a let statement
      final JsonElement vlstate = vstate;
    final JsonElement vletvar$lemit$3;
    { // new scope introduced for a let statement
      final JsonElement vlemit = vemit;
    final JsonElement t2;
    if (RuntimeUtils.asBoolean(UnaryOperators.neg(UnaryOperators.neg(BinaryOperators.equals(UnaryOperators.dot("lender", UnaryOperators.unbrand(vcontract)), UnaryOperators.dot("borrower", UnaryOperators.unbrand(vcontract))))))) {
      t2 = UnaryOperators.right(UnaryOperators.brand(new RuntimeUtils.CollectionBuilder<String>(1).add("org.accordproject.ergo.stdlib.ErgoErrorResponse").result(), UnaryOperators.rec("message", new JsonPrimitive("The lender and the borrower cannot be the same entity."))));
    } else {
      final JsonElement t1;
      if (RuntimeUtils.asBoolean(UnaryOperators.neg(UnaryOperators.neg(BinaryOperators.le(UnaryOperators.dot("value", UnaryOperators.unbrand(vtx)), new RuntimeUtils.JsonObjectBuilder().add("nat", new JsonPrimitive(0)).toJsonObject()))))) {
        t1 = UnaryOperators.right(UnaryOperators.brand(new RuntimeUtils.CollectionBuilder<String>(1).add("org.accordproject.ergo.stdlib.ErgoErrorResponse").result(), UnaryOperators.rec("message", new JsonPrimitive("The IOU's value must be non-negative."))));
      } else {
        t1 = UnaryOperators.left(BinaryOperators.concat(BinaryOperators.concat(UnaryOperators.rec("response", UnaryOperators.brand(new RuntimeUtils.CollectionBuilder<String>(1).add("org.accordproject.cicero.runtime.Response").result(), new RuntimeUtils.JsonObjectBuilder().toJsonObject())), UnaryOperators.rec("state", vlstate)), UnaryOperators.rec("emit", vlemit)));
      }
      t2 = t1;
    }
      vletvar$lemit$3 = t2;
    }
      vletvar$lstate$4 = vletvar$lemit$3;
    }
      vletvar$state$5 = vletvar$lstate$4;
    }
      vletvar$emit$6 = vletvar$state$5;
    }
      vletvar$contract$7 = vletvar$emit$6;
    }
      vletvar$contract_0$8 = vletvar$contract$7;
    }
      vletvar$tx$9 = vletvar$contract_0$8;
    }
    return vletvar$tx$9;
  }

}


