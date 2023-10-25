
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import MemberMemberManager from "./components/listers/MemberMemberCards"
import MemberMemberDetail from "./components/listers/MemberMemberDetail"

import OrderOrderManager from "./components/listers/OrderOrderCards"
import OrderOrderDetail from "./components/listers/OrderOrderDetail"

import Manager from "./components/listers/Cards"
import Detail from "./components/listers/Detail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/members/members',
                name: 'MemberMemberManager',
                component: MemberMemberManager
            },
            {
                path: '/members/members/:id',
                name: 'MemberMemberDetail',
                component: MemberMemberDetail
            },

            {
                path: '/orders/orders',
                name: 'OrderOrderManager',
                component: OrderOrderManager
            },
            {
                path: '/orders/orders/:id',
                name: 'OrderOrderDetail',
                component: OrderOrderDetail
            },

            {
                path: '//',
                name: 'Manager',
                component: Manager
            },
            {
                path: '///:id',
                name: 'Detail',
                component: Detail
            },



    ]
})
