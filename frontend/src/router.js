
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import StandardManager from "./components/listers/StandardCards"
import StandardDetail from "./components/listers/StandardDetail"

import ProductionManager from "./components/listers/ProductionCards"
import ProductionDetail from "./components/listers/ProductionDetail"
import ProdStandardManager from "./components/listers/ProdStandardCards"
import ProdStandardDetail from "./components/listers/ProdStandardDetail"

import PackingManager from "./components/listers/PackingCards"
import PackingDetail from "./components/listers/PackingDetail"


import DashboardView from "./components/DashboardView"
import DashboardViewDetail from "./components/DashboardViewDetail"

export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/standards',
                name: 'StandardManager',
                component: StandardManager
            },
            {
                path: '/standards/:id',
                name: 'StandardDetail',
                component: StandardDetail
            },

            {
                path: '/productions',
                name: 'ProductionManager',
                component: ProductionManager
            },
            {
                path: '/productions/:id',
                name: 'ProductionDetail',
                component: ProductionDetail
            },
            {
                path: '/prodStandards',
                name: 'ProdStandardManager',
                component: ProdStandardManager
            },
            {
                path: '/prodStandards/:id',
                name: 'ProdStandardDetail',
                component: ProdStandardDetail
            },

            {
                path: '/packings',
                name: 'PackingManager',
                component: PackingManager
            },
            {
                path: '/packings/:id',
                name: 'PackingDetail',
                component: PackingDetail
            },


            {
                path: '/dashboards',
                name: 'DashboardView',
                component: DashboardView
            },
            {
                path: '/dashboards/:id',
                name: 'DashboardViewDetail',
                component: DashboardViewDetail
            },


    ]
})
