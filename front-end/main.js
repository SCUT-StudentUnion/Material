Vue.component('vtable', {
    props: ["a"],
    template: "<p>{{a.text}}</p>"
})


var app = new Vue({
    el: '#app',
    data: {
        message: Date().toString(),
        m2: '',
        i: 0,
        show: true,
        todos: [{
            text: "a",
            id: 1
        }, {
            text: "b",
            id: 5
        }, {
            text: "c",
            id: 9
        }],

    }
});

app.$watch("message", function (newvalue, oldvalue) {
    if (this.i > 3)
        return;
    document.getElementById("pp").innerHTML = document.getElementById("pp").innerHTML + "<br>" + newvalue;
    this.i++;

})

var Main = {
    data() {
        return {
            tableData: [{
                date: '2016-05-02',
                name: '王小虎',
                address: '上海市普陀区金沙江路 1518 弄'
            }, {
                date: '2016-05-04',
                name: '王小虎',
                address: '上海市普陀区金沙江路 1517 弄'
            }, {
                date: '2016-05-01',
                name: '王小虎',
                address: '上海市普陀区金沙江路 1519 弄'
            }, {
                date: '2016-05-03',
                name: '王小虎',
                address: '上海市普陀区金沙江路 1516 弄'
            }],
            show: "true"
        }
    }
}
var Ctor = Vue.extend(Main)
new Ctor().$mount('#app2')
